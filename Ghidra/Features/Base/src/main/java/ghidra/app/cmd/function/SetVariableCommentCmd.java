/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.cmd.function;

import ghidra.framework.cmd.Command;
import ghidra.program.model.listing.Program;
import ghidra.program.model.listing.Variable;

/**
 * Command to set the comment on a function varible.
 */
public class SetVariableCommentCmd implements Command<Program> {
	private Variable var;
	private String comment;
	private String msg;

	/**
	 * Constructs a new command for setting the comment on a function variable.
	 * @param var the variable on which to set the comment.
	 * @param newComment the comment string to set on the specified variable.
	 */
	public SetVariableCommentCmd(Variable var, String newComment) {
		this.var = var;
		this.comment = newComment;
	}

	@Override
	public String getName() {
		return "Set Variable Comment";
	}

	@Override
	public boolean applyTo(Program program) {
		var.setComment(comment);
		return true;
	}

	@Override
	public String getStatusMsg() {
		return msg;
	}

}
