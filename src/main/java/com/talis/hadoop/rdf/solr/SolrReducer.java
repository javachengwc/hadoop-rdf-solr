/*
 *    Copyright 2011 Talis Systems Ltd
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.talis.hadoop.rdf.solr;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.solr.hadoop.SolrRecordWriter;

import com.talis.hadoop.rdf.QuadArrayWritable;

public class SolrReducer extends Reducer<Text, QuadArrayWritable, Text, QuadArrayWritable> {

	@Override
	protected void setup(Context context) throws IOException, InterruptedException {
	    super.setup(context);
	    SolrRecordWriter.addReducerContext(context);
	}
	
}
