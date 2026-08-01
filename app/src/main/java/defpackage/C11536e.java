package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11536e implements InterfaceC3851e {
    public final String ad;

    public C11536e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11536e) && AbstractC7890e.billing(this.ad, ((C11536e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("TransferCancelledByVersion(expectedVersionName="), this.ad, ')');
    }
}
