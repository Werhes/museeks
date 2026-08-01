package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524e implements InterfaceC12296e {
    public static final C1524e ad = new Object();
    public static Boolean vip;

    @Override // defpackage.InterfaceC12296e
    public final /* synthetic */ void ad(C6260e c6260e) {
    }

    @Override // defpackage.InterfaceC12296e
    public final /* synthetic */ void appmetrica(C0763e c0763e) {
    }

    @Override // defpackage.InterfaceC12296e
    public final void license(boolean z) {
        vip = Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC12296e
    public final /* synthetic */ void metrica(Function1 function1) {
    }

    @Override // defpackage.InterfaceC12296e
    public final /* synthetic */ void purchase(Function1 function1) {
    }

    @Override // defpackage.InterfaceC12296e
    public final boolean vip() {
        Boolean bool = vip;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC8703e.Signature("canFocus is read before it is written");
    }
}
