package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3128e extends AbstractC17557e implements RandomAccess {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f7202e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0193e[] f7203e;

    public C3128e(C0193e[] c0193eArr, int[] iArr) {
        this.f7203e = c0193eArr;
        this.f7202e = iArr;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0193e) {
            return super.contains((C0193e) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f7203e[i];
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0193e) {
            return super.indexOf((C0193e) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0193e) {
            return super.lastIndexOf((C0193e) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f7203e.length;
    }
}
