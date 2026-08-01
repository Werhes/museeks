package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14225e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f28104e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f28105e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C0895e f28106e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28107e;

    public C14225e(C0895e c0895e, int i) {
        this.f28107e = i;
        switch (i) {
            case 1:
                this.f28106e = c0895e;
                while (true) {
                    int i2 = this.f28105e;
                    C0895e c0895e2 = this.f28106e;
                    if (i2 >= c0895e2.f3289e) {
                        return;
                    }
                    int i3 = c0895e2.f3293e[i2];
                    if (i3 >= 0 && c0895e2.f3294e[i3] != null) {
                        return;
                    } else {
                        this.f28105e = i2 + 1;
                    }
                }
                break;
            case 2:
                this.f28106e = c0895e;
                while (true) {
                    int i4 = this.f28105e;
                    C0895e c0895e3 = this.f28106e;
                    if (i4 >= c0895e3.f3289e) {
                        return;
                    }
                    int i5 = c0895e3.f3293e[i4];
                    if (i5 >= 0 && c0895e3.f3294e[i5] != null) {
                        return;
                    } else {
                        this.f28105e = i4 + 1;
                    }
                }
                break;
            default:
                this.f28106e = c0895e;
                while (true) {
                    int i6 = this.f28105e;
                    C0895e c0895e4 = this.f28106e;
                    if (i6 >= c0895e4.f3289e) {
                        return;
                    }
                    int i7 = c0895e4.f3293e[i6];
                    if (i7 >= 0 && c0895e4.f3294e[i7] != null) {
                        return;
                    } else {
                        this.f28105e = i6 + 1;
                    }
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28107e) {
            case 0:
                return this.f28105e < this.f28106e.f3289e;
            case 1:
                return this.f28105e < this.f28106e.f3289e;
            default:
                return this.f28105e < this.f28106e.f3289e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        int i2;
        int i3;
        switch (this.f28107e) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                C0895e c0895e = this.f28106e;
                int[] iArr = c0895e.f3293e;
                int i4 = this.f28105e;
                int i5 = iArr[i4];
                String str = c0895e.f3294e[i5];
                this.f28104e = str;
                C14330e c14330e = new C14330e(c0895e, str, c0895e.f3291e[i5]);
                this.f28105e = i4 + 1;
                while (true) {
                    int i6 = this.f28105e;
                    if (i6 < c0895e.f3289e && ((i = c0895e.f3293e[i6]) < 0 || c0895e.f3294e[i] == null)) {
                        this.f28105e = i6 + 1;
                    }
                }
                return c14330e;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                C0895e c0895e2 = this.f28106e;
                int[] iArr2 = c0895e2.f3293e;
                int i7 = this.f28105e;
                this.f28104e = c0895e2.f3294e[iArr2[i7]];
                this.f28105e = i7 + 1;
                while (true) {
                    int i8 = this.f28105e;
                    if (i8 < c0895e2.f3289e && ((i2 = c0895e2.f3293e[i8]) < 0 || c0895e2.f3294e[i2] == null)) {
                        this.f28105e = i8 + 1;
                    }
                }
                return this.f28104e;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                C0895e c0895e3 = this.f28106e;
                int[] iArr3 = c0895e3.f3293e;
                int i9 = this.f28105e;
                int i10 = iArr3[i9];
                this.f28104e = c0895e3.f3294e[i10];
                Object obj = c0895e3.f3291e[i10];
                this.f28105e = i9 + 1;
                while (true) {
                    int i11 = this.f28105e;
                    if (i11 < c0895e3.f3289e && ((i3 = c0895e3.f3293e[i11]) < 0 || c0895e3.f3294e[i3] == null)) {
                        this.f28105e = i11 + 1;
                    }
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28107e) {
            case 0:
                String str = this.f28104e;
                if (str == null) {
                    throw new IllegalStateException("next() must be called before remove()");
                }
                this.f28106e.remove(str);
                this.f28104e = null;
                return;
            case 1:
                String str2 = this.f28104e;
                if (str2 == null) {
                    throw new IllegalStateException("next() must be called before remove()");
                }
                this.f28106e.remove(str2);
                this.f28104e = null;
                return;
            default:
                String str3 = this.f28104e;
                if (str3 == null) {
                    throw new IllegalStateException("next() must be called before remove()");
                }
                this.f28106e.remove(str3);
                this.f28104e = null;
                return;
        }
    }
}
