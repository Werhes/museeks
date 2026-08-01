package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11798e implements InterfaceC15269e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15816e f23677e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16964e f23678e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23679e = 0;

    public C11798e(C15816e c15816e, InterfaceC18006e interfaceC18006e) {
        this.f23677e = c15816e;
        this.f23678e = interfaceC18006e;
    }

    public C11798e(InterfaceC18006e interfaceC18006e, C15816e c15816e) {
        this.f23678e = interfaceC18006e;
        this.f23677e = c15816e;
    }

    @Override // defpackage.InterfaceC16964e
    public final Object get() {
        switch (this.f23679e) {
            case 0:
                return new C5233e((Context) this.f23677e.f31190e, (C10618e) this.f23678e.get());
            default:
                return new C6852e((C10426e) this.f23678e.get(), (InterfaceC8850e) this.f23677e.f31190e);
        }
    }
}
