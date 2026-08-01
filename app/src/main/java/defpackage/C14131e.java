package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14131e {
    public final ArrayList ad;
    public final C15681e vip;

    public C14131e(ArrayList arrayList, C15681e c15681e) {
        this.ad = arrayList;
        this.vip = c15681e;
        AbstractC4265e.license(!arrayList.isEmpty(), "Camera ID set cannot be empty.");
    }

    public final String ad() {
        ArrayList arrayList = this.ad;
        AbstractC4265e.yandex("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) AbstractC13480e.m3591interface(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14131e)) {
            return false;
        }
        C14131e c14131e = (C14131e) obj;
        return this.ad.equals(c14131e.ad) && AbstractC7890e.billing(this.vip, c14131e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C15681e c15681e = this.vip;
        return hashCode + (c15681e != null ? c15681e.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.<init>(r1)
            r6 = 0
            r7 = 62
            java.util.ArrayList r2 = r8.ad
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = defpackage.AbstractC13480e.m3608try(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            eٕۘۥ r1 = r8.vip
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", compatId="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L2d
        L2b:
            java.lang.String r1 = ""
        L2d:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = defpackage.AbstractC4653e.applovin(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14131e.toString():java.lang.String");
    }
}
