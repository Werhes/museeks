package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072e implements InterfaceC16707e {
    public final String ad;
    public final List metrica;
    public final String vip;

    public C1072e(String str, String str2, List list) {
        this.ad = str;
        this.vip = str2;
        this.metrica = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1072e.class == obj.getClass()) {
            C1072e c1072e = (C1072e) obj;
            if (TextUtils.equals(this.ad, c1072e.ad) && TextUtils.equals(this.vip, c1072e.vip) && this.metrica.equals(c1072e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.vip;
        return this.metrica.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.ad;
        sb.append(str != null ? AbstractC1786e.signatures(AbstractC8703e.applovin(" [", str, ", "), this.vip, "]") : BuildConfig.FLAVOR);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
