package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7841e {
    public String ad;
    public ArrayList appmetrica;
    public int license;
    public C13198e metrica;
    public ArrayList purchase;
    public EnumC7300e vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7841e)) {
            return false;
        }
        C7841e c7841e = (C7841e) obj;
        if (this.license != c7841e.license) {
            return false;
        }
        String str = this.ad;
        if (str != null) {
            if (!str.equals(c7841e.ad)) {
                return false;
            }
        } else if (c7841e.ad != null) {
            return false;
        }
        if (this.vip != c7841e.vip) {
            return false;
        }
        C13198e c13198e = this.metrica;
        if (c13198e != null) {
            if (!c13198e.equals(c7841e.metrica)) {
                return false;
            }
        } else if (c7841e.metrica != null) {
            return false;
        }
        ArrayList arrayList = this.appmetrica;
        if (arrayList != null) {
            if (!arrayList.equals(c7841e.appmetrica)) {
                return false;
            }
        } else if (c7841e.appmetrica != null) {
            return false;
        }
        ArrayList arrayList2 = this.purchase;
        ArrayList arrayList3 = c7841e.purchase;
        return arrayList2 != null ? arrayList2.equals(arrayList3) : arrayList3 == null;
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC7300e enumC7300e = this.vip;
        int hashCode2 = (hashCode + (enumC7300e != null ? enumC7300e.hashCode() : 0)) * 31;
        C13198e c13198e = this.metrica;
        int hashCode3 = (((hashCode2 + (c13198e != null ? c13198e.hashCode() : 0)) * 31) + this.license) * 31;
        ArrayList arrayList = this.appmetrica;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList arrayList2 = this.purchase;
        return hashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }
}
