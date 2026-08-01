package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15547e implements Iterable, InterfaceC2268e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30696e;

    public C15547e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f30696e = str;
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return new C8146e(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15547e) {
            return this.f30696e.equals(((C15547e) obj).f30696e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30696e.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8146e(1, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2268e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC2268e remoteconfig(java.lang.String r28, defpackage.C11467e r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15547e.remoteconfig(java.lang.String, eِؒۜ, java.util.ArrayList):eٜؓۨ");
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        return this.f30696e;
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        String str = this.f30696e;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return new C15547e(this.f30696e);
    }

    public final String toString() {
        String str = this.f30696e;
        return AbstractC8647e.ads(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        return Boolean.valueOf(!this.f30696e.isEmpty());
    }
}
