package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8146e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f16541e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f16542e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16543e;

    public /* synthetic */ C8146e(int i, Object obj) {
        this.f16543e = i;
        this.f16541e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16543e) {
            case 0:
                return this.f16542e < ((C15547e) this.f16541e).f30696e.length();
            case 1:
                return this.f16542e < ((C15547e) this.f16541e).f30696e.length();
            default:
                return this.f16542e < ((C5273e) this.f16541e).Signature();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f16543e) {
            case 0:
                String str = ((C15547e) this.f16541e).f30696e;
                int i = this.f16542e;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f16542e = i + 1;
                return new C15547e(String.valueOf(i));
            case 1:
                C15547e c15547e = (C15547e) this.f16541e;
                String str2 = c15547e.f30696e;
                int i2 = this.f16542e;
                if (i2 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f16542e = i2 + 1;
                return new C15547e(String.valueOf(c15547e.f30696e.charAt(i2)));
            default:
                C5273e c5273e = (C5273e) this.f16541e;
                if (this.f16542e >= c5273e.Signature()) {
                    int i3 = this.f16542e;
                    throw new NoSuchElementException(AbstractC8647e.isPro(i3, "Out of bounds index: ", new StringBuilder(String.valueOf(i3).length() + 21)));
                }
                int i4 = this.f16542e;
                this.f16542e = i4 + 1;
                return c5273e.admob(i4);
        }
    }
}
