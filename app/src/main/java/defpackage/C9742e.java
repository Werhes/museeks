package defpackage;

import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.DnsOptions;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.QuicOptions;
import org.chromium.net.vip;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9742e implements vip {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C9742e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // org.chromium.net.vip
    public final void ad(JSONObject jSONObject) {
        switch (this.ad) {
            case 0:
                ExperimentalCronetEngine.Builder.ad((QuicOptions) this.vip, jSONObject);
                return;
            case 1:
                ExperimentalCronetEngine.Builder.metrica((DnsOptions) this.vip, jSONObject);
                return;
            default:
                ExperimentalCronetEngine.Builder.vip((ConnectionMigrationOptions) this.vip, jSONObject);
                return;
        }
    }
}
