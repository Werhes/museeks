package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18316e {
    public final String ad;
    public String appmetrica;
    public int license;
    public final int metrica;
    public final int vip;

    public C18316e(int i, int i2) {
        this(RecyclerView.UNDEFINED_DURATION, i, i2);
    }

    public C18316e(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = BuildConfig.FLAVOR;
        }
        this.ad = str;
        this.vip = i2;
        this.metrica = i3;
        this.license = RecyclerView.UNDEFINED_DURATION;
        this.appmetrica = BuildConfig.FLAVOR;
    }

    public final void ad() {
        int i = this.license;
        this.license = i == Integer.MIN_VALUE ? this.vip : i + this.metrica;
        this.appmetrica = this.ad + this.license;
    }

    public final void vip() {
        if (this.license == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
