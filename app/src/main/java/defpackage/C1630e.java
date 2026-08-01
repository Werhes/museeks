package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1630e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f4552e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f4553e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4554e;

    public /* synthetic */ C1630e(int i, Object obj) {
        this.f4554e = i;
        this.f4552e = obj;
    }

    public C1630e(C2511e c2511e) {
        this.f4554e = 2;
        this.f4552e = c2511e;
        this.f4553e = c2511e.metrica;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4554e) {
            case 0:
                return this.f4553e < ((AbstractC17557e) this.f4552e).subs();
            case 1:
                return this.f4553e < ((Object[]) this.f4552e).length;
            case 2:
                return this.f4553e > 0;
            case 3:
                return this.f4553e < ((byte[]) this.f4552e).length;
            case 4:
                return this.f4553e < ((int[]) this.f4552e).length;
            case 5:
                return this.f4553e < ((long[]) this.f4552e).length;
            case 6:
                return this.f4553e < ((short[]) this.f4552e).length;
            default:
                return this.f4553e < ((ViewGroup) this.f4552e).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4554e) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC17557e abstractC17557e = (AbstractC17557e) this.f4552e;
                int i = this.f4553e;
                this.f4553e = i + 1;
                return abstractC17557e.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f4552e;
                    int i2 = this.f4553e;
                    this.f4553e = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f4553e--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                C2511e c2511e = (C2511e) this.f4552e;
                int i3 = c2511e.metrica;
                int i4 = this.f4553e;
                this.f4553e = i4 - 1;
                return c2511e.appmetrica[i3 - i4];
            case 3:
                int i5 = this.f4553e;
                byte[] bArr = (byte[]) this.f4552e;
                if (i5 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4553e));
                }
                this.f4553e = i5 + 1;
                return new C9287e(bArr[i5]);
            case 4:
                int i6 = this.f4553e;
                int[] iArr = (int[]) this.f4552e;
                if (i6 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4553e));
                }
                this.f4553e = i6 + 1;
                return new C2875e(iArr[i6]);
            case 5:
                int i7 = this.f4553e;
                long[] jArr = (long[]) this.f4552e;
                if (i7 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4553e));
                }
                this.f4553e = i7 + 1;
                return new C10994e(jArr[i7]);
            case 6:
                int i8 = this.f4553e;
                short[] sArr = (short[]) this.f4552e;
                if (i8 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f4553e));
                }
                this.f4553e = i8 + 1;
                return new C11330e(sArr[i8]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f4552e;
                int i9 = this.f4553e;
                this.f4553e = i9 + 1;
                View childAt = viewGroup.getChildAt(i9);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4554e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f4552e;
                int i = this.f4553e - 1;
                this.f4553e = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
