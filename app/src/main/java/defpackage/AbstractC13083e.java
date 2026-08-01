package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13083e {
    public static final C2892e ad = new C2892e(1488533819, false, new C8580e(16));
    public static final C2892e vip = new C2892e(1845180972, false, new C8580e(17));
    public static final C2892e metrica = new C2892e(-852672316, false, new C8580e(18));

    public static void ad(C12402e c12402e, CharSequence charSequence) {
        AbstractC1266e.purchase(c12402e, charSequence, charSequence.length(), 8);
    }

    public static final boolean license(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final int metrica(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final InterfaceC3314e vip(C15274e c15274e, C13770e c13770e, int i) {
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(c15274e)) || (i & 6) == 4;
        Object m3681throw2 = c13770e.m3681throw();
        if (z || m3681throw2 == c5170e) {
            m3681throw2 = new C1030e(c15274e, interfaceC3314e, null, 3);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw2);
        return interfaceC3314e;
    }
}
