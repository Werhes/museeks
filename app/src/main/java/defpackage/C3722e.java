package defpackage;

import j$.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3722e extends AbstractC18345e {
    public final /* synthetic */ Object inmobi;
    public final /* synthetic */ C5710e isVip;
    public final /* synthetic */ int tapsense = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3722e(C5710e c5710e, C18076e c18076e) {
        super(c5710e, false);
        this.inmobi = c18076e;
        this.isVip = c5710e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3722e(C5710e c5710e, int[] iArr) {
        super(c5710e, true);
        this.inmobi = iArr;
        Objects.requireNonNull(c5710e);
        this.isVip = c5710e;
    }

    @Override // defpackage.AbstractC18345e
    public final void amazon() {
        int i = this.tapsense;
        Object obj = this.inmobi;
        C5710e c5710e = this.isVip;
        switch (i) {
            case 0:
                C18111e c18111e = c5710e.metrica;
                InterfaceC10846e loadAd = loadAd();
                int[] iArr = (int[]) obj;
                c18111e.getClass();
                JSONObject jSONObject = new JSONObject();
                long metrica = c18111e.metrica();
                try {
                    jSONObject.put("requestId", metrica);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", c18111e.appmetrica());
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 : iArr) {
                        jSONArray.put(i2);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                c18111e.vip(metrica, jSONObject.toString());
                c18111e.remoteconfig.ad(metrica, loadAd);
                return;
            default:
                C18111e c18111e2 = c5710e.metrica;
                InterfaceC10846e loadAd2 = loadAd();
                c18111e2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long metrica2 = c18111e2.metrica();
                long j = ((C18076e) obj).ad;
                try {
                    jSONObject2.put("requestId", metrica2);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", c18111e2.appmetrica());
                    Pattern pattern = AbstractC5942e.ad;
                    jSONObject2.put("currentTime", j / 1000.0d);
                } catch (JSONException unused2) {
                }
                c18111e2.vip(metrica2, jSONObject2.toString());
                c18111e2.billing = Long.valueOf(j);
                c18111e2.smaato.ad(metrica2, new C0642e(c18111e2, loadAd2));
                return;
        }
    }
}
