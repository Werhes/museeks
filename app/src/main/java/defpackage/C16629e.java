package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16629e extends AbstractC8918e {
    public static final C11467e billing;
    public static final Set purchase;
    public static final C12386e yandex;
    public final C11467e appmetrica;
    public final Set license;
    public final Level metrica;
    public final String vip;

    /* JADX WARN: Type inference failed for: r2v3, types: [eِؒۜ, java.lang.Object] */
    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC14416e.ad, InterfaceC15352e.ad, AbstractC5649e.ad)));
        purchase = unmodifiableSet;
        C11980e metrica = AbstractC3265e.metrica(unmodifiableSet);
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        obj.f23072e = hashMap;
        HashMap hashMap2 = new HashMap();
        obj.f23070e = hashMap2;
        hashMap.putAll((HashMap) metrica.f23950e);
        hashMap2.putAll((HashMap) metrica.f23949e);
        obj.f23069e = (C0959e) metrica.f23951e;
        obj.f23071e = (C0611e) metrica.f23948e;
        billing = obj;
        yandex = new C12386e(Level.ALL, unmodifiableSet, obj);
    }

    public /* synthetic */ C16629e(String str, Level level, Set set, C11467e c11467e) {
        super(str);
        this.vip = AbstractC14783e.adcel(str);
        this.metrica = level;
        this.license = set;
        this.appmetrica = c11467e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b2, code lost:
    
        r1 = r11.charAt(r8);
        r2 = r1 & ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
    
        if (r2 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
    
        r7 = defpackage.C15794e.appmetrica;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01bf, code lost:
    
        if (r6 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c1, code lost:
    
        if (r3 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c5, code lost:
    
        r3 = defpackage.C15794e.appmetrica;
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c9, code lost:
    
        r25 = r13;
        r26 = r14;
        r20 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0262, code lost:
    
        r2 = defpackage.EnumC8410e.f17188e[(r1 | ' ') - 97];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026b, code lost:
    
        if (r24 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026d, code lost:
    
        if (r2 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0274, code lost:
    
        if ((r2.f17189e & 128) == 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0277, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0278, code lost:
    
        r7 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027a, code lost:
    
        if (r2 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027c, code lost:
    
        r3.getClass();
        r1 = r2.f17189e;
        r8 = r2.f17190e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0284, code lost:
    
        if (r8 == 1) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0287, code lost:
    
        if (r8 == 2) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028b, code lost:
    
        if (r8 == r17) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x028e, code lost:
    
        if (r8 == 4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0291, code lost:
    
        if (r8 != 5) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0295, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0296, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029b, code lost:
    
        if (r3.vip(r1, r6) == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        if (r12 >= 10) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a1, code lost:
    
        r1 = defpackage.C8111e.f16470e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a7, code lost:
    
        if (r3.ad() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a9, code lost:
    
        r1 = (defpackage.C8111e[]) defpackage.C8111e.f16470e.get(r2);
        defpackage.AbstractC9835e.advert(r1, "default parameter");
        r1 = r1[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x031c, code lost:
    
        r2 = r1.f31257e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0320, code lost:
    
        if (r2 >= 32) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0322, code lost:
    
        r10.f2465e |= 1 << r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x032b, code lost:
    
        r10.f2464e = java.lang.Math.max(r10.f2464e, r2);
        r5.smaato(r10.f2466e, r9, r11, r4);
        r2 = (java.lang.Object[]) r10.f2469e;
        r3 = r1.f31257e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x033f, code lost:
    
        if (r3 >= r2.length) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0341, code lost:
    
        r2 = r2[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0343, code lost:
    
        if (r2 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0345, code lost:
    
        r1.mo474while(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0349, code lost:
    
        r4.append("null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x034f, code lost:
    
        r4.append("[ERROR: MISSING LOG ARGUMENT]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b9, code lost:
    
        r1 = new defpackage.C8111e(r12, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c5, code lost:
    
        throw defpackage.C14803e.vip(r9, r7, "invalid format specifier", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0293, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02cc, code lost:
    
        if (r1 == 't') goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d0, code lost:
    
        if (r1 != 'T') goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d6, code lost:
    
        if (r1 == 'h') goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02da, code lost:
    
        if (r1 != 'H') goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02e2, code lost:
    
        throw defpackage.C14803e.vip(r9, r7, "invalid format specification", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e7, code lost:
    
        if (r3.vip(160, false) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e9, code lost:
    
        r1 = new defpackage.AbstractC15825e(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02f4, code lost:
    
        throw defpackage.C14803e.vip(r9, r7, "invalid format specification", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f9, code lost:
    
        if (r3.vip(160, false) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02fb, code lost:
    
        r8 = r8 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0301, code lost:
    
        if (r8 > r11.length()) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0303, code lost:
    
        r1 = (defpackage.EnumC7566e) defpackage.EnumC7566e.f15389e.get(java.lang.Character.valueOf(r11.charAt(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0313, code lost:
    
        if (r1 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0315, code lost:
    
        r1 = new defpackage.C5466e(r3, r12, r1);
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036d, code lost:
    
        throw defpackage.C14803e.metrica("illegal date/time conversion", r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0374, code lost:
    
        throw defpackage.C14803e.metrica("truncated format specifier", r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0379, code lost:
    
        throw defpackage.C14803e.vip(r9, r7, "invalid format specification", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01d1, code lost:
    
        if (true == r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01d3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01d7, code lost:
    
        if (r6 != r8) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01e3, code lost:
    
        r7 = r6 + 1;
        r24 = r2;
        r2 = r11.charAt(r6);
        r25 = r13;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01f3, code lost:
    
        if (r2 < ' ') goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01f7, code lost:
    
        if (r2 <= '0') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01fc, code lost:
    
        r20 = r15;
        r14 = ((int) ((defpackage.C15794e.license >>> ((r2 - ' ') * 3)) & 7)) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x020d, code lost:
    
        if (r14 >= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0224, code lost:
    
        r2 = 1 << r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x022a, code lost:
    
        if ((r3 & r2) != 0) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x022c, code lost:
    
        r3 = r3 | r2;
        r6 = r7;
        r15 = r20;
        r2 = r24;
        r13 = r25;
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x023d, code lost:
    
        throw defpackage.C14803e.metrica("repeated flag", r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0211, code lost:
    
        if (r2 != '.') goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0213, code lost:
    
        r3 = new defpackage.C15794e(r3, -1, defpackage.C15794e.appmetrica(r7, r8, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0223, code lost:
    
        throw defpackage.C14803e.metrica("invalid flag", r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01f9, code lost:
    
        r20 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0240, code lost:
    
        if (r2 > '9') goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0242, code lost:
    
        r2 = r2 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0244, code lost:
    
        if (r7 != r8) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x024e, code lost:
    
        r13 = r7 + 1;
        r14 = r11.charAt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0256, code lost:
    
        if (r14 != '.') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x037a, code lost:
    
        r14 = (char) (r14 - '0');
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0383, code lost:
    
        if (r14 >= '\n') goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0385, code lost:
    
        r2 = (r2 * 10) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x038b, code lost:
    
        if (r2 > 999999) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x038d, code lost:
    
        r7 = r13;
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0398, code lost:
    
        throw defpackage.C14803e.vip(r6, r8, "width too large", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x039f, code lost:
    
        throw defpackage.C14803e.metrica("invalid width character", r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0258, code lost:
    
        r6 = new defpackage.C15794e(r3, r2, defpackage.C15794e.appmetrica(r13, r8, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x024c, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0246, code lost:
    
        r6 = new defpackage.C15794e(r3, r2, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03a4, code lost:
    
        throw defpackage.C14803e.metrica("invalid flag", r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01d9, code lost:
    
        r24 = r2;
        r3 = new defpackage.C15794e(r3, -1, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01d5, code lost:
    
        r3 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01bc, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03c2, code lost:
    
        throw new defpackage.C14803e(defpackage.C14803e.license(r9, -1, "unterminated parameter", r11), 20, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0160, code lost:
    
        throw new defpackage.C14803e(defpackage.C14803e.license(r9, -1, "unterminated parameter", r11), 20, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0167, code lost:
    
        throw defpackage.C14803e.vip(r9, r8, "index has leading zero", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x016e, code lost:
    
        throw defpackage.C14803e.vip(r9, r8, "missing index", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x016f, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0172, code lost:
    
        if (r1 != '<') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0174, code lost:
    
        if (r12 == (-1)) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x017a, code lost:
    
        if (r8 == r11.length()) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x017c, code lost:
    
        r11.charAt(r8);
        r6 = r8;
        r8 = r22 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0190, code lost:
    
        throw new defpackage.C14803e(defpackage.C14803e.license(r9, -1, "unterminated parameter", r11), 20, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0197, code lost:
    
        throw defpackage.C14803e.vip(r9, r8, "invalid relative parameter", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0198, code lost:
    
        r12 = r16;
        r16 = r16 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0134, code lost:
    
        if (r1 != '$') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0138, code lost:
    
        if ((r22 - r6) == 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        if (r11.charAt(r6) == '0') goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0140, code lost:
    
        r20 = r20 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0146, code lost:
    
        if (r8 == r11.length()) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        r11.charAt(r8);
        r6 = r8;
        r12 = r20;
        r8 = r22 + 2;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019e, code lost:
    
        r8 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a3, code lost:
    
        if (r8 >= r11.length()) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b0, code lost:
    
        if (((char) ((r11.charAt(r8) & 65503) - 65)) >= 26) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a5, code lost:
    
        r8 = r8 + 1;
        r15 = r15;
        r17 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void license(defpackage.C6713e r32, java.lang.String r33, java.util.logging.Level r34, java.util.Set r35, defpackage.C11467e r36) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16629e.license(eؙۡٗ, java.lang.String, java.util.logging.Level, java.util.Set, eِؒۜ):void");
    }

    @Override // defpackage.AbstractC8918e
    public final boolean ad(Level level) {
        int mopub = AbstractC14783e.mopub(level);
        return Log.isLoggable(this.vip, mopub) || Log.isLoggable("all", mopub);
    }

    @Override // defpackage.AbstractC8918e
    public final void vip(C6713e c6713e) {
        license(c6713e, this.vip, this.metrica, this.license, this.appmetrica);
    }
}
