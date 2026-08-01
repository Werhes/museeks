package ua.itaysonlab.vkapi2.methods.auth;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/auth/RefreshToken$RTToken", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RefreshToken$RTToken {
    public final String ad;

    public RefreshToken$RTToken(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshToken$RTToken) && AbstractC7890e.billing(this.ad, ((RefreshToken$RTToken) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("RTToken(token="), this.ad, ')');
    }
}
