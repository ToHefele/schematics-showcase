import {strings} from "@angular-devkit/core";
import {apply, MergeStrategy, mergeWith, move, Rule, SchematicContext, template, Tree, url} from "@angular-devkit/schematics";



// You don't have to export the function as default. You can also have more than one rule factory
// per file.
export function schematicsShowcase(_options: any): Rule {
  return (tree: Tree, _context: SchematicContext) => {
    const templateSource = apply(url("./files"), [
      template({
        ...strings,
        ..._options
      }),
      move(".")
    ]);

    const rule = mergeWith(templateSource, MergeStrategy.Default);
    return rule(tree, _context);
  };
}
