package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f5143e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Iterable f5145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5146e = 3;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f5144e = 0;

    public C1952e(C1884e c1884e) {
        this.f5145e = c1884e;
        this.f5143e = c1884e.f5020e.length;
    }

    public C1952e(C2096e c2096e) {
        this.f5145e = c2096e;
        this.f5143e = c2096e.size();
    }

    public C1952e(C6283e c6283e) {
        this.f5145e = c6283e;
        this.f5143e = c6283e.size();
    }

    public C1952e(AbstractC7244e abstractC7244e) {
        this.f5145e = abstractC7244e;
        this.f5143e = abstractC7244e.billing();
    }

    public C1952e(C11133e c11133e) {
        this.f5145e = c11133e;
        this.f5143e = c11133e.yandex();
    }

    public C1952e(C11507e c11507e) {
        this.f5145e = c11507e;
        this.f5143e = c11507e.size();
    }

    public byte ad() {
        try {
            byte[] bArr = ((C1884e) this.f5145e).f5020e;
            int i = this.f5144e;
            this.f5144e = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5146e) {
            case 0:
                return this.f5144e < this.f5143e;
            case 1:
                return this.f5144e < this.f5143e;
            case 2:
                return this.f5144e < this.f5143e;
            case 3:
                return this.f5144e < this.f5143e;
            case 4:
                return this.f5144e < this.f5143e;
            default:
                return this.f5144e < this.f5143e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5146e) {
            case 0:
                int i = this.f5144e;
                if (i >= this.f5143e) {
                    throw new NoSuchElementException();
                }
                this.f5144e = i + 1;
                return Byte.valueOf(((C11507e) this.f5145e).advert(i));
            case 1:
                int i2 = this.f5144e;
                if (i2 >= this.f5143e) {
                    throw new NoSuchElementException();
                }
                this.f5144e = i2 + 1;
                return Byte.valueOf(((C2096e) this.f5145e).smaato(i2));
            case 2:
                int i3 = this.f5144e;
                if (i3 >= this.f5143e) {
                    throw new NoSuchElementException();
                }
                this.f5144e = i3 + 1;
                return Byte.valueOf(((C6283e) this.f5145e).advert(i3));
            case 3:
                return Byte.valueOf(ad());
            case 4:
                int i4 = this.f5144e;
                if (i4 >= this.f5143e) {
                    throw new NoSuchElementException();
                }
                this.f5144e = i4 + 1;
                return Byte.valueOf(((AbstractC7244e) this.f5145e).appmetrica(i4));
            default:
                int i5 = this.f5144e;
                if (i5 >= this.f5143e) {
                    throw new NoSuchElementException();
                }
                this.f5144e = i5 + 1;
                return Byte.valueOf(((C11133e) this.f5145e).billing(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5146e) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
