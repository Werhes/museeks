package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٟٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11900e extends AbstractC9615e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f23841e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f23842e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayList f23843e;

    public C11900e(int i, long j) {
        super(i, 3);
        this.f23842e = j;
        this.f23843e = new ArrayList();
        this.f23841e = new ArrayList();
    }

    public final C18375e Signature(int i) {
        ArrayList arrayList = this.f23843e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18375e c18375e = (C18375e) arrayList.get(i2);
            if (c18375e.f19062e == i) {
                return c18375e;
            }
        }
        return null;
    }

    public final C11900e amazon(int i) {
        ArrayList arrayList = this.f23841e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11900e c11900e = (C11900e) arrayList.get(i2);
            if (c11900e.f19062e == i) {
                return c11900e;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC9615e
    public final String toString() {
        return AbstractC9615e.vip(this.f19062e) + " leaves: " + Arrays.toString(this.f23843e.toArray()) + " containers: " + Arrays.toString(this.f23841e.toArray());
    }
}
