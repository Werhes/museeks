package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13071e implements InterfaceC14567e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f26006e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26005e = -1;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26004e = -1;

    public C13071e(int i) {
        this.f26006e = i;
    }

    @Override // defpackage.InterfaceC14567e
    public final Object appmetrica() {
        return this;
    }

    @Override // defpackage.InterfaceC14567e
    public final boolean yandex(CharSequence charSequence, int i, int i2, C17115e c17115e) {
        int i3 = this.f26006e;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f26005e = i;
        this.f26004e = i2;
        return false;
    }
}
