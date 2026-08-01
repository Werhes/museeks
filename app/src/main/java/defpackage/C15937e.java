package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15937e extends AbstractC17557e implements InterfaceC5072e, RandomAccess, Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Enum[] f31395e;

    public C15937e(Enum[] enumArr) {
        this.f31395e = enumArr;
    }

    @Override // defpackage.AbstractC7674e, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) AbstractC1660e.crashlytics(r4.ordinal(), this.f31395e)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f31395e;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC1786e.Signature(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) AbstractC1660e.crashlytics(ordinal, this.f31395e)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC17557e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        if (((Enum) AbstractC1660e.crashlytics(ordinal, this.f31395e)) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f31395e.length;
    }
}
