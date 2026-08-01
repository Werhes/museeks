package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9034e implements InterfaceC12006e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function2 f18090e;

    public C9034e(Function2 function2) {
        this.f18090e = function2;
    }

    @Override // defpackage.InterfaceC12006e
    public final /* synthetic */ void adcel(InterfaceC15671e interfaceC15671e) {
    }

    @Override // defpackage.InterfaceC12006e
    public final /* synthetic */ C4988e advert() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9034e) && AbstractC7890e.billing(this.f18090e, ((C9034e) obj).f18090e);
    }

    public final int hashCode() {
        return this.f18090e.hashCode();
    }

    @Override // defpackage.InterfaceC12006e
    public final void mopub(C2573e c2573e) {
        int i;
        int i2;
        int i3;
        int i4;
        C17013e yandex = C2573e.yandex(c2573e, 0L, null, 15);
        C4860e c4860e = c2573e.f6429e;
        C17013e c17013e = c2573e.f6433e;
        CharSequence charSequence = (CharSequence) this.f18090e.invoke(c17013e, yandex);
        if (charSequence == yandex) {
            return;
        }
        boolean z = false;
        if (charSequence == c17013e) {
            c2573e.metrica(0, c4860e.length(), c17013e.f33322e.toString());
            c2573e.billing(c17013e.f33324e);
            c2573e.ad().admob();
            return;
        }
        int length = c4860e.length();
        int length2 = charSequence.length();
        if (c4860e.length() <= 0 || charSequence.length() <= 0) {
            i = 0;
            i2 = 0;
            i3 = length;
            i4 = length2;
        } else {
            boolean z2 = false;
            int i5 = length;
            int i6 = length2;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (!z) {
                    if (c4860e.charAt(i7) == charSequence.charAt(i8)) {
                        i7++;
                        i8++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    if (c4860e.charAt(i5 - 1) == charSequence.charAt(i6 - 1)) {
                        i5--;
                        i6--;
                    } else {
                        z2 = true;
                    }
                }
                if (i7 >= i5 || i8 >= i6 || (z && z2)) {
                    break;
                }
            }
            i2 = i8;
            i4 = i6;
            i3 = i5;
            i = i7;
        }
        if (i < i3 || i2 < i4) {
            c2573e.license(i, i3, charSequence, i2, i4);
        }
    }

    public final String toString() {
        return "InputTransformation.byValue(transformation=" + this.f18090e + ')';
    }
}
