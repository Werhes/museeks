package defpackage;

import java.util.AbstractList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5959e extends AbstractList {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC4873e f12560e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC7569e f12561e;

    public C5959e(InterfaceC7569e interfaceC7569e, InterfaceC4873e interfaceC4873e) {
        this.f12561e = interfaceC7569e;
        this.f12560e = interfaceC4873e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int yandex = ((C5407e) this.f12561e).yandex(i);
        ((C8455e) this.f12560e).getClass();
        EnumC16535e vip = EnumC16535e.vip(yandex);
        return vip == null ? EnumC16535e.UNKNOWN : vip;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C5407e) this.f12561e).f11594e;
    }
}
