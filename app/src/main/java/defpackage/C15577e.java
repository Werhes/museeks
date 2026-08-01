package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15577e extends AbstractC5877e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object[] f30748e;

    @Override // defpackage.AbstractC5877e
    public final int appmetrica() {
        return this.f30747e;
    }

    @Override // defpackage.AbstractC5877e
    public final void billing(int i, C11720e c11720e) {
        Object[] objArr = this.f30748e;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f30748e = Arrays.copyOf(this.f30748e, length);
        }
        Object[] objArr2 = this.f30748e;
        if (objArr2[i] == null) {
            this.f30747e++;
        }
        objArr2[i] = c11720e;
    }

    @Override // defpackage.AbstractC5877e
    public final Object get(int i) {
        return AbstractC1660e.crashlytics(i, this.f30748e);
    }

    @Override // defpackage.AbstractC5877e, java.lang.Iterable
    public final Iterator iterator() {
        return new C18347e(this);
    }
}
