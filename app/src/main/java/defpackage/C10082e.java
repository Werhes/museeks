package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10082e {
    public static final Pattern metrica = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int ad = -1;
    public int vip = -1;

    public final boolean ad(String str) {
        Matcher matcher = metrica.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = AbstractC9413e.ad;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.ad = parseInt;
            this.vip = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.vip.equals("com.apple.iTunes") && r7.metrica.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.C17750e r11) {
        /*
            r10 = this;
            r11.getClass()
            eْٗۤ r0 = defpackage.AbstractC17475e.Signature()
            eٗؑۥ[] r11 = r11.ad
            int r1 = r11.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 0
            java.lang.String r5 = "iTunSMPB"
            if (r3 >= r1) goto L39
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<eَْۚ> r8 = defpackage.C10514e.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L31
            java.lang.Object r6 = r8.cast(r6)
            eٗؑۥ r6 = (defpackage.InterfaceC16707e) r6
            r7 = r6
            eَْۚ r7 = (defpackage.C10514e) r7
            java.lang.String r7 = r7.metrica
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L31
            r4 = r6
        L31:
            if (r4 == 0) goto L36
            r0.metrica(r4)
        L36:
            int r3 = r3 + 1
            goto Lc
        L39:
            eؒۢۗ r0 = r0.billing()
            eؓۢٔ r0 = r0.listIterator(r2)
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            eَْۚ r1 = (defpackage.C10514e) r1
            java.lang.String r1 = r1.license
            boolean r1 = r10.ad(r1)
            if (r1 == 0) goto L41
            goto Lb2
        L56:
            eْٗۤ r0 = defpackage.AbstractC17475e.Signature()
            int r1 = r11.length
            r3 = r2
        L5c:
            if (r3 >= r1) goto L96
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<eًؑ۟> r8 = defpackage.C7658e.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r8.cast(r6)
            eٗؑۥ r6 = (defpackage.InterfaceC16707e) r6
            r7 = r6
            eًؑ۟ r7 = (defpackage.C7658e) r7
            java.lang.String r8 = r7.vip
            java.lang.String r9 = "com.apple.iTunes"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L89
            java.lang.String r7 = r7.metrica
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L89
            r7 = 1
            goto L8a
        L89:
            r7 = r2
        L8a:
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r6 = r4
        L8e:
            if (r6 == 0) goto L93
            r0.metrica(r6)
        L93:
            int r3 = r3 + 1
            goto L5c
        L96:
            eؒۢۗ r11 = r0.billing()
            eؓۢٔ r11 = r11.listIterator(r2)
        L9e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r11.next()
            eًؑ۟ r0 = (defpackage.C7658e) r0
            java.lang.String r0 = r0.license
            boolean r0 = r10.ad(r0)
            if (r0 == 0) goto L9e
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10082e.vip(eۣ٘ٓ):void");
    }
}
