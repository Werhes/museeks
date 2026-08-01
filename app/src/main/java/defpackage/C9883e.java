package defpackage;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۤۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9883e extends AbstractC18345e {
    public final /* synthetic */ C5710e isVip;
    public final /* synthetic */ int tapsense;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9883e(C5710e c5710e, int i) {
        super(c5710e, true);
        this.tapsense = i;
        switch (i) {
            case 5:
                Objects.requireNonNull(c5710e);
                this.isVip = c5710e;
                super(c5710e, false);
                return;
            default:
                Objects.requireNonNull(c5710e);
                this.isVip = c5710e;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9883e(C5710e c5710e, int i, boolean z) {
        super(c5710e, false);
        this.tapsense = i;
        this.isVip = c5710e;
    }

    @Override // defpackage.AbstractC18345e
    public final void amazon() {
        switch (this.tapsense) {
            case 0:
                this.isVip.metrica.license(loadAd(), -1);
                return;
            case 1:
                this.isVip.metrica.license(loadAd(), 1);
                return;
            case 2:
                C18111e c18111e = this.isVip.metrica;
                InterfaceC10846e loadAd = loadAd();
                c18111e.getClass();
                JSONObject jSONObject = new JSONObject();
                long metrica = c18111e.metrica();
                try {
                    jSONObject.put("requestId", metrica);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", c18111e.appmetrica());
                } catch (JSONException unused) {
                }
                c18111e.vip(metrica, jSONObject.toString());
                c18111e.subscription.ad(metrica, loadAd);
                return;
            case 3:
                C18111e c18111e2 = this.isVip.metrica;
                InterfaceC10846e loadAd2 = loadAd();
                c18111e2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long metrica2 = c18111e2.metrica();
                try {
                    jSONObject2.put("requestId", metrica2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", c18111e2.appmetrica());
                } catch (JSONException unused2) {
                }
                c18111e2.vip(metrica2, jSONObject2.toString());
                c18111e2.mopub.ad(metrica2, loadAd2);
                return;
            case 4:
                C18111e c18111e3 = this.isVip.metrica;
                InterfaceC10846e loadAd3 = loadAd();
                c18111e3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long metrica3 = c18111e3.metrica();
                try {
                    jSONObject3.put("requestId", metrica3);
                    jSONObject3.put("type", "PLAY");
                    jSONObject3.put("mediaSessionId", c18111e3.appmetrica());
                } catch (JSONException unused3) {
                }
                c18111e3.vip(metrica3, jSONObject3.toString());
                c18111e3.advert.ad(metrica3, loadAd3);
                return;
            default:
                C18111e c18111e4 = this.isVip.metrica;
                InterfaceC10846e loadAd4 = loadAd();
                c18111e4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long metrica4 = c18111e4.metrica();
                try {
                    jSONObject4.put("requestId", metrica4);
                    jSONObject4.put("type", "GET_STATUS");
                    C0849e c0849e = c18111e4.purchase;
                    if (c0849e != null) {
                        jSONObject4.put("mediaSessionId", c0849e.f3239e);
                    }
                } catch (JSONException unused4) {
                }
                c18111e4.vip(metrica4, jSONObject4.toString());
                c18111e4.Signature.ad(metrica4, loadAd4);
                return;
        }
    }
}
