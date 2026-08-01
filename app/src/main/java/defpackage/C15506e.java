package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15506e {
    public final C7222e ad;
    public final C7222e vip;

    public C15506e(C7222e c7222e, C7222e c7222e2) {
        this.ad = c7222e;
        this.vip = c7222e2;
    }

    public final void ad(String str, Function2 function2) {
        Iterator it = this.ad.m2267e(str, "TRUEPREDICATE", new Object[0]).metrica().iterator();
        while (it.hasNext()) {
            InterfaceC16120e interfaceC16120e = (InterfaceC16120e) it.next();
            function2.invoke(interfaceC16120e, this.vip.m2268e(interfaceC16120e));
        }
    }
}
