package defpackage;

import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC16478e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f32301e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f32302e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f32303e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32304e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32305e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f32306e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32307e;

    public /* synthetic */ RunnableC16478e(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, int i) {
        this.f32305e = i;
        this.f32302e = obj;
        this.f32304e = obj2;
        this.f32301e = obj3;
        this.f32307e = obj4;
        this.f32306e = serializable;
        this.f32303e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32305e) {
            case 0:
                C17669e c17669e = (C17669e) this.f32302e;
                Pair pair = (Pair) this.f32304e;
                ((C4174e) c17669e.f34628e.startapp).inmobi(((Integer) pair.first).intValue(), (C18208e) pair.second, (C6913e) this.f32301e, (C0807e) this.f32307e, (IOException) this.f32306e, this.f32303e);
                return;
            default:
                C16864e c16864e = (C16864e) this.f32302e;
                C4753e c4753e = (C4753e) this.f32304e;
                InterfaceC2881e interfaceC2881e = (InterfaceC2881e) this.f32301e;
                C5186e c5186e = (C5186e) this.f32307e;
                EnumC14627e enumC14627e = (EnumC14627e) this.f32306e;
                if (interfaceC2881e == c16864e.license()) {
                    c16864e.inmobi = c4753e.license(interfaceC2881e, true);
                    c5186e.getClass();
                    InterfaceC16798e interfaceC16798e = (InterfaceC16798e) AbstractC0054e.loadAd(c5186e, C5186e.f11091e);
                    Objects.requireNonNull(interfaceC16798e);
                    interfaceC16798e.yandex(c16864e.inmobi, enumC14627e, this.f32303e);
                    c16864e.m4190implements();
                    return;
                }
                return;
        }
    }
}
