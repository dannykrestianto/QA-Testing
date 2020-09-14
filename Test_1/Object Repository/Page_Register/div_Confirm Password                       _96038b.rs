<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Confirm Password                       _96038b</name>
   <tag></tag>
   <elementGuidId>eded7aeb-7190-4c10-afbb-61b6623dafad</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='basicBootstrapForm']/div[13]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>form-group</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                        Confirm Password
                        
                                                           function validatepasswords(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var password2=document.getElementById(&quot;secondpassword&quot;).value;                     if (!(password1==password2))                     {                         input.setCustomValidity('Passwords dont match');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 function validatepattern(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var pattern =/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]){4,6}(?!.*\s ).*$/;                     if (!(pattern.test(input.value)))                     {                         input.setCustomValidity('Please Enter an UpperCase,LowerCase Alphabet and a Number');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 
                        
                    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;basicBootstrapForm&quot;)/div[@class=&quot;form-group&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='basicBootstrapForm']/div[13]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Date Of Birth'])[1]/following::div[6]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/preceding::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[13]</value>
   </webElementXpaths>
</WebElementEntity>
