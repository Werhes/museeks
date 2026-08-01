package defpackage;

import android.text.SpannableStringBuilder;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8380e {
    public static final C8380e appmetrica;
    public static final C8380e license;
    public static final String metrica;
    public static final String vip;
    public final boolean ad;

    static {
        C16722e c16722e = AbstractC17379e.metrica;
        vip = Character.toString((char) 8206);
        metrica = Character.toString((char) 8207);
        license = new C8380e(false);
        appmetrica = new C8380e(true);
    }

    public C8380e(boolean z) {
        C16722e c16722e = AbstractC17379e.ad;
        this.ad = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.metrica <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.ad()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ad(java.lang.CharSequence r9) {
        /*
            eٓؓۧ r0 = new eٓؓۧ
            r0.<init>(r9)
            r9 = 0
            r0.metrica = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.metrica
            int r5 = r0.vip
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.ad
            char r4 = r5.charAt(r4)
            r0.license = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.metrica
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.metrica
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.metrica = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.metrica
            int r4 = r4 + r7
            r0.metrica = r4
            char r4 = r0.license
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = defpackage.C13740e.appmetrica
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L85
        L69:
            if (r3 != 0) goto L6c
            goto L8b
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8c
        L71:
            if (r2 == 0) goto L74
            return r2
        L74:
            int r2 = r0.metrica
            if (r2 <= 0) goto L8c
            byte r2 = r0.ad()
            switch(r2) {
                case 14: goto L89;
                case 15: goto L89;
                case 16: goto L83;
                case 17: goto L83;
                case 18: goto L80;
                default: goto L7f;
            }
        L7f:
            goto L74
        L80:
            int r3 = r3 + 1
            goto L74
        L83:
            if (r1 != r3) goto L86
        L85:
            return r7
        L86:
            int r3 = r3 + (-1)
            goto L74
        L89:
            if (r1 != r3) goto L86
        L8b:
            return r6
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8380e.ad(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int vip(java.lang.CharSequence r6) {
        /*
            eٓؓۧ r0 = new eٓؓۧ
            r0.<init>(r6)
            int r6 = r0.vip
            r0.metrica = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.metrica
            if (r3 <= 0) goto L3f
            byte r3 = r0.ad()
            if (r3 == 0) goto L38
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r2 != 0) goto Lc
            goto L3e
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            if (r2 != r1) goto L2c
            goto L34
        L2c:
            int r1 = r1 + (-1)
            goto Lc
        L2f:
            if (r2 != r1) goto L2c
            goto L3a
        L32:
            if (r1 != 0) goto L35
        L34:
            return r4
        L35:
            if (r2 != 0) goto Lc
            goto L3e
        L38:
            if (r1 != 0) goto L3c
        L3a:
            r6 = -1
            return r6
        L3c:
            if (r2 != 0) goto Lc
        L3e:
            goto Lb
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8380e.vip(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder metrica(CharSequence charSequence) {
        C16722e c16722e = AbstractC17379e.metrica;
        if (charSequence == null) {
            return null;
        }
        boolean smaato = c16722e.smaato(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean smaato2 = (smaato ? AbstractC17379e.vip : AbstractC17379e.ad).smaato(charSequence, charSequence.length());
        String str = BuildConfig.FLAVOR;
        String str2 = metrica;
        String str3 = vip;
        boolean z = this.ad;
        spannableStringBuilder.append((CharSequence) ((z || !(smaato2 || ad(charSequence) == 1)) ? (!z || (smaato2 && ad(charSequence) != -1)) ? BuildConfig.FLAVOR : str2 : str3));
        if (smaato != z) {
            spannableStringBuilder.append(smaato ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean smaato3 = (smaato ? AbstractC17379e.vip : AbstractC17379e.ad).smaato(charSequence, charSequence.length());
        if (!z && (smaato3 || vip(charSequence) == 1)) {
            str = str3;
        } else if (z && (!smaato3 || vip(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
