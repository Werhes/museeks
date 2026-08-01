package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9282e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13825e f18501e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18502e;

    public /* synthetic */ C9282e(C13825e c13825e, int i) {
        this.f18502e = i;
        this.f18501e = c13825e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean purchase;
        switch (this.f18502e) {
            case 0:
                purchase = C17150e.purchase(this.f18501e);
                break;
            default:
                C6434e c6434e = InterfaceC2531e.yandex;
                InterfaceC2531e interfaceC2531e = this.f18501e.vip;
                c6434e.getClass();
                purchase = C6434e.vip(interfaceC2531e);
                break;
        }
        return Boolean.valueOf(purchase);
    }
}
