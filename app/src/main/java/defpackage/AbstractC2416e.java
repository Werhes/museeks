package defpackage;

import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2416e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final File f6198e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f6199e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f6200e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f6201e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f6202e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f6203e;

    public AbstractC2416e(String str, long j, long j2, long j3, File file) {
        this.f6202e = str;
        this.f6200e = j;
        this.f6199e = j2;
        this.f6201e = file != null;
        this.f6198e = file;
        this.f6203e = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC2416e abstractC2416e) {
        String str = abstractC2416e.f6202e;
        String str2 = this.f6202e;
        if (!str2.equals(str)) {
            return str2.compareTo(abstractC2416e.f6202e);
        }
        long j = this.f6200e - abstractC2416e.f6200e;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f6200e);
        sb.append(", ");
        return AbstractC5087e.m1750native(this.f6199e, "]", sb);
    }
}
