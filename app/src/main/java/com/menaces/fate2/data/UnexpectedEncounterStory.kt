package com.menaces.fate2.data
import com.menaces.fate2.R
import com.menaces.fate2.model.Screen

object UnexpectedEncounterStory {

    val screens: List<Screen> = listOf(
        Screen(
            "You are sitting in the coffee shop, and you really need to get to business " +
                    "and study for your basket weaving class. Chad is the barista.",
            R.drawable.basket_weaving,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "You go up to get a Chai latte with 2 pumps of raspberry, oat milk, 67% ice. " +
                    "Chad gives you a look and hands you the drink, spelling your name wrong (he " +
                    "spells “basic”). You can either:",
            R.drawable.coffee_drink,
            "Ask him on a date",
            "Throw coffee at him",
            1,
            2,
            true,
        ),
        Screen(
            "You ask him on a date. He instantly says yes!",
            R.drawable.ask_him_on_date,
            "",
            "",
            2,
            0,
            false
        ),
        Screen(
            "Surprisingly, he’s into getting hot drinks thrown at him, coffee being his " +
                    "number one. He asks you on a date.",
            R.drawable.into_spilled_coffee,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "You can either:",
            R.drawable.thinking,
            "Go rollerblading",
            "Go to slam poetry",
            14,
            1,
            true
        ),
        Screen(
            "\nYou get ready for slam poetry and meet Chad in front of the " +
                    "dark alleyway: the entrance to slam poetry. A chill goes up " +
                    "your spine. Chad, noticing, quickly strips off his jacket and " +
                    "gently places it around your shoulders. Nudging him with your " +
                    "elbow, you both enter the land of slam poetry.",
            R.drawable.slam_poetry_stage,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "A man – tall, lean, hair perfectly gelled back – stands in front of the mic. " +
                    "I look over to Chad and he’s frozen. Who is this man?",
            R.drawable.slam_poetry,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "Mystery Man takes a deep breath and begins to recite his poem:",
            R.drawable.slam_poetry,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n\nPick up the phone\n" +
                    "I’m all alone\n" +
                    "Chad, what a lad\n" +
                    "You make me so sad\n" +
                    "I’m going mad\n" +
                    "Because of what we had\n" +
                    "Oh Chad\n" +
                    "Wouldn’t it be quite rad\n" +
                    "To go back to the past\n" +
                    "We had a blast",
            R.drawable.slam_poetry,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\"Before people have the chance to boo, much less snap their fingers, Chad " +
                    "leaves my side and quickly rushes to the stage.",
            R.drawable.chad_reciting,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "As if they were actors in the “You Belong with Me” music video, Chad pulls " +
                    "out a sheet of paper and recites his poem, staring into Mystery Man’s eyes " +
                    "like they were the last things he’ll ever see:",
            R.drawable.chad_reciting,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nSteve, I didn’t leave\n" +
                    "How I grieve\n" +
                    "I can’t believe\n" +
                    "I didn’t see\n" +
                    "What was right in front of me\n" +
                    "Will you marry me?\"",
            R.drawable.chad_reciting,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\"And with that, Chad is down on one knee, ring in hand. Steve, already in " +
                    "tears, nods his head yes. They happily embrace. The crowd goes wild. \n" +
                    "\n" +
                    "You can either:",
            R.drawable.proposal_bw_chad_steve,
            "Stay to congratulate",
            "Become a nun",
            1,
            5,
            true
        ),
        Screen(
            "Brad comes over and introduces his new fiance. The skinny jeans and sense " +
                    "of style, you should have known from the start.",
            R.drawable.chad_steve_walking_over,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "Although you feel slightly betrayed, you give them a smile.\n" +
                    "“Congratulations to the both of you,” you say, willingly.\"",
            R.drawable.congrats,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "They smile back. Chad the barista and Steve the awful poet, make their way " +
                    "out of the crowd and into the night, with a future they will share for the " +
                    "rest of their lives.",
            R.drawable.chad_steve_exiting,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // ENDING 1
            "You let out a little chuckle. This will be a story you tell during drunk " +
                    "nights and late time highs. Did I tell you about the time I had an " +
                    "unexpected encounter? ",
            R.drawable.drinking,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen( // ENDING 2
            "As the crowd cheers, you make your way to the exit. Heartbroken and alone, " +
                    "you decide to become a nun.\n",
            R.drawable.nun,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen(
            "You dash home, excited to get ready for this date. You Google Meet your " +
                    "bestie, Priscilla, ready to share the tea about this hot new man.",
            R.drawable.facetiming_prissy,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n“Hey Sissy Prissy,” you exclaim. \n" +
                    "\n" +
                    "“Hey bestie bae!” Priscilla says, throwing up an unsolicited peace sign and duck face. “What’s the tea?”\n" +
                    "\n",
            R.drawable.facetiming_prissy,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n\n“OMG! Girl, you’re not gonna believe this, but I got a hot new date.” Priscilla looks shocked.\n" +
                    "\n" +
                    "“No way?? What’s their name, LOL?”" +
                    "“Chad,” you say, eyes getting dreamy. “He likes when people throw coffee " +
                    "at him.” Priscilla’s shock turns quickly into disgust.\n",
            R.drawable.prissy_shook,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "“Men named Chad are walking red flags.”\n"
                    + "I stare at her, disappointed. I thought she would support this. I finally " +
                    "found the man of my dreams and the least she could do is grant her blessing.",
            R.drawable.prissy_shook,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nShe seemed to notice my weary look and sighed.\n" +
                    "“While I don’t completely support this, I hope everything works out.”\n" +
                    "\n" +
                    "You smile.\n" +
                    "“Thanks Sissy Prissy. I knew I could always count on you.”",
            R.drawable.facetiming_prissy,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nShe chuckles.\n" +
                    "“Let me know how it goes. I’ll buy a pint of chocolate raisin pistachio ice " +
                    "cream just in case things don’t turn out the way you wanted it too crying emoji uwu.”\n" +
                    "\n" +
                    "“Until then mwah.”\n" +
                    "\n" +
                    "“Mwah.”",
            R.drawable.facetiming_prissy,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "The Google Meet ends. You finish getting ready and head out to go " +
                    "rollerblading with Chad, the barista.",
            R.drawable.finishing_getting_ready,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // TRANSITION SCREEN
            "",
            R.drawable.roller_blading,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nYou arrive at the roller rink, running into Chad by the entrance.\n" +
                    "\n" +
                    "“Hey there, hot stuff,” you say, immediately regretting it afterwards.\n",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "He gives you a wink.\n" +
                    "\n" +
                    "“You know, I really like you aLATTE,” he responds, using the same tone.\n" +
                    "\n" +
                    "You burst into laughter.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n“Shall we head in, Chadrista?” offering your arm.\n" +
                    "\n" +
                    "He nods his head and reaches for your hand instead. Both blushing, " +
                    "you make your way into the rink. You pick up your shoes, put them on, " +
                    "then waddle together onto the rink.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "“Oh shoot,” you say. “I don’t think these fit me.” Chad frowns. " +
                    "“Do you want to exchange them?”\n" +
                    "You can either",
            R.drawable.bittern,
            "Suffer through the badly fitting shoes",
            "Get new ones",
            1,
            5, // TODO: undecided
            true
        ),
        Screen(
            "“Nah, it’ll be fine.” You smirk. “You’ll catch me if I fall, right?”\n" +
                    "\n" +
                    "Chad returns your smile. “Abso-tooting-lutely!”",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n\nAt some point, you begin to lose your balance. Before making contact " +
                    "with the ground, Chad rushes to your side, catching you.\n" +
                    "\n" +
                    "“Are you alright?” he asks, concerned.\n" +
                    "\n" +
                    "“Better than ever,” you reply, with a smile as wide as the Milky Way.\n",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nYou see him, tuxedo and all, down on his knee. His tears are glistening in " +
                    "the light, his smile as bright as a thousand suns. You take off your " +
                    "rollerblades and sprint to him, knocking him off his feet and to the " +
                    "ground.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // ENDING 3 (33)
            "Laughing and crying, you quietly say yes. You and Chad embrace,\n" +
                    "sealing the night off with a kiss. The crowd goes wild. Cheers to a new\n" +
                    "life, a new future, and happy beginnings.\"",
            R.drawable.bittern,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen(
            "“Yeah, I’ll be right back.” You skate off the rink and exchange your shoes.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\ntw: mild gore, broken bones" +
                    "\n\n" +
                    "Suddenly, you hear a scream from the rink. Waddling as fast as you can, " +
                    "you see Chad lying on the ground, a pool of blood quickly growing underneath " +
                    "him, his head bashed and a bone sticking out of his leg. " +
                    "“No!” you shout. “Chadrista, my love!” You rush to his side and cradle his " +
                    "head in your arms. The world blurs and fades out.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n\nAfter being denied to ride in the ambulance with Chad, you call up Priscilla " +
                    "and ask for a ride. Barely arriving, you rush into the hospital. Desperately " +
                    "trying to find Chad, you enter a hallway. Upon reaching the end of the hallway, " +
                    "you must decide whether to turn left or right. \n" +
                    "You can either:",
            R.drawable.bittern,
            "Turn left",
            "Turn right",
            1,
            15,
            true
        ),
        Screen(
            "You take a left and somehow were able to find Chad’s room. His vitals seem " +
                    "stable, but he’s definitely unconscious. Tears began to form around your eyes, " +
                    "quickly turning into a waterfall. Sobbing, you rush to his side. And thus, your " +
                    "profession of love began.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n“Oh Chad, my beloved barista, from the day we met, which unbelievably was just " +
                    "today, I knew. I knew you were my soulmate, my half, the love of my life. " +
                    "You were my everything. I loved you from the start – when you gave me the " +
                    "nickname “basic” and then caught me from falling at the rink – and " +
                    "I will always love you,” you weep in between the words.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nYou hold his hand. Slowly, you feel a tight squeeze coming from his side. He " +
                    "opens his eyes, still looking very pale and feeble. Chad gives you a little smile.\n",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n“I love you too,” words barely coming out of his mouth, “I heard everything. " +
                    "You are my everything. Thank you for staying by my side.”\n" +
                    "\n" +
                    "Our eyes interlock, and with that, so do our hearts. The doctor comes in, " +
                    "breaking the silence. ",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "“Mr. Chadavonivich Rista, I’m afraid I will have to bear you with bad news. " +
                    "Lab results are in and they are not looking good. I’m sorry sir, but you will " +
                    "not live to see another day,” he states, sternly.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "I look at Chad, but his eyes are not meeting mine. Instead, he‘s looking at " +
                    "his heart rate monitor, slowing down by the second.\n " +
                    "“I will leave you two to discuss.”",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nThe doctor steps away, the silence creeping back in. Chad motions me to come " +
                    "closer and passes you his will, which he surprisingly has with him at all times " +
                    "in case situations like these happen. He asks you to write down Brad’s name, " +
                    "as he is too weak to do it himself. \n" +
                    "You can either: ",
            R.drawable.bittern,
            "Sign your name",
            "Sign Brad's name",
            1,
            5,
            true
        ),
        Screen(
            "Congratulations! While Chad may be dead, you now inherited all of his money! " +
                    "Who knew being a barista earned so much money (not considering any of his side " +
                    "hustles)?  As you reach out for your margarita, you hear a knock at the door.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nKnock. Knock knock. \nSlowly rising from your seat, you make your way to the door." +
                    " Opening it, you’re shocked to see the one and only Chadavonivich Rista standing " +
                    "at your door.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n“Chad?” you ask, looking as pale as a ghost. \n" +
                    "\n" +
                    "“No,” he responds, calmly, but confidently.\n" +
                    "\n" +
                    "The splitting image of Chad, the love of your life, is alive. Sticking his " +
                    "hand out he introduces himself.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // ENDING 4
            "“I’m Bradavonivich Rista. We need to talk.”",
            R.drawable.bittern,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen(
            "\nAfter signing Brad’s name , you step out of his room, allowing Chad to live " +
                    "his last few moments in peace. Upon exiting, you run into a tall man – " +
                    "finely built, dressed in slacks and a hoodie – holding a bouquet of flowers. " +
                    "You do a double take. \n",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "The man lets out a little chuckle and sticks his hand out.\n" +
                    "\n" +
                    "“Hi, I’m Brad, short for Bradavonivich. You must be the lucky girl Chad was " +
                    "always going on and on about today.”",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // ENDING
            "\nI shook his hand and looked him in the eyes. Yup, that’s definitely Chad’s brother. " +
                    "Or maybe this man was a clone sent to replace Chad’s body. That can’t be it, right?\n" +
                    "\n" +
                    "Either way, he’s pretty cute. Chad or Brad, this was definitely an unexpected encounter. \n",
            R.drawable.bittern,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen(
            "You take a right and you see a man, covered in bandages from head to toe, " +
                    "laying in the hospital bed, unconscious. Oh no, it's so much worse than you thought.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nYou start to blame yourself for leaving his side to change out your rollerblades, " +
                    "wishing you had stayed with him instead. Seizing the moment, you fall to the floor.\n" +
                    "\n" +
                    "“Chad, I think I’m in love with you,” you exclaim loud and clear.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "Chad opens his eyes and turns to me, in confusion.\n" +
                    "\n" +
                    "“Who are you? How did you get into my room? I’m calling the police,” " +
                    "he says angrily. \n" +
                    "You can either:",
            R.drawable.bittern,
            "Sue him for identity theft",
            "Ask who he is",
            1,
            3,
            true
        ),
        Screen(
            "\nUnfortunately, you lose this case. Not only did you lose Chad, but you also lost " +
                    "thousands of money to his brother – who coincidentally landed in the same hospital " +
                    "and the same time as Chad – Brad.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nEvery time you close your eyes, you picture Brad’s smug face, a wad of cash fanned " +
                    "out before him, desperately needing a punch to the face. You sigh. An unexpected " +
                    "counter that was. ",
            R.drawable.bittern,
            "",
            "",
            0,
            0,
            false
        ),
        Screen(
            "\nAssuming you were in the wrong hospital room, you ask him who he is. \n" +
                    "\n" +
                    "Boldly, he claims, “I am Bradavonivich, long for Brad. Got into a really bad " +
                    "motorcycling incident and well look where it got me. Stay in school, kid.”",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "Staring into his eyes, you see a future with him. Maybe Chad wasn’t the one, " +
                    "but he led you to THE ONE. Plus, you kind of dig the whole motorcycle get-up",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nInstead of looking for Chad, you spend hours talking to Brad, the motorcycle mystery " +
                    "man. You learn he is a library clerk, a fellow Gleek, and a lead guitarist in a band " +
                    "called The Gigabytes.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\n\nAfter two and a half years of recovery, Brad invites you to see his band perform," +
                    " the first time he’s performed since the accident. You and Brad have been going out " +
                    "for two and a half years, from the adventures of physical therapy to adventures at " +
                    "the coffee shop. ",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nExpecting his bandmates to join him on stage, he stands there, alone. Confused " +
                    "and worried the show was canceled, you squirm in your seat. Seconds later, the " +
                    "spotlight shines on Brad, and he serenades you with your favorite song. ",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\nAfter the last lyric leaves his lips, he swings his guitar back and bends down on one knee.\n" +
                    "\n" +
                    "“I love you, forever and always. Will you marry me?”\n" +
                    "You can either:",
            R.drawable.bittern,
            "Say yes",
            "Say no",
            1,
            2,
            true
        ),
        Screen( // ENDING
            "\nCovered in tears, you make your way to the stage. \n" +
                    "\n" +
                    "“Yes!” you exclaim with joy. \n" +
                    "\n" +
                    "You and Brad embrace each other like there is no tomorrow. The end.",
            R.drawable.bittern,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        ),
        Screen(
            "\nA part of you still is in love with Chad. While he is not here, you vow to dedicate " +
                    "your heart to him and therefore reject Brad's proposal. Running off the stage, " +
                    "you live in the woods for the rest of your life.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "One day, you run into a lumberjack. Needing some wood, you go up to him.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen(
            "\"Hello...may I ask for your name and some wood, Mr. Lumberjack\" you ask, " +
                    "curious about the Mystery Man living in the deep woods. He turns around.",
            R.drawable.bittern,
            "",
            "",
            1,
            0,
            false
        ),
        Screen( // ENDING
            "The lumberjack turns around.\n" +
                    "Scruff, but clean, he flashes you a smile.\n" +
                    "\"My name is Chad and I'd be delighted to give some wood to you.\"\n",
            R.drawable.bittern,
            "RETURN TO HOME",
            "",
            0,
            0,
            false
        )

        )
}