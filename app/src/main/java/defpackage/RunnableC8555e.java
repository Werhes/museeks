package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC8555e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ BinderC14884e f17374e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8019e f17375e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17376e;

    public /* synthetic */ RunnableC8555e(BinderC14884e binderC14884e, C8019e c8019e, int i) {
        this.f17376e = i;
        this.f17375e = c8019e;
        this.f17374e = binderC14884e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17376e) {
            case 0:
                BinderC14884e binderC14884e = this.f17374e;
                binderC14884e.metrica.m3946default();
                binderC14884e.metrica.m3943catch(this.f17375e);
                return;
            case 1:
                BinderC14884e binderC14884e2 = this.f17374e;
                binderC14884e2.metrica.m3946default();
                C15398e c15398e = binderC14884e2.metrica;
                c15398e.mo2262e().mo2250e();
                c15398e.m3947else();
                C8019e c8019e = this.f17375e;
                AbstractC9528e.startapp(c8019e);
                String str = c8019e.f16300e;
                AbstractC9528e.purchase(str);
                int i = 0;
                if (c15398e.m3958package().m2822e(null, AbstractC17254e.f33846e)) {
                    c15398e.mo2259e().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int m2825e = c15398e.m3958package().m2825e(null, AbstractC17254e.f33868switch);
                    c15398e.m3958package();
                    long longValue = currentTimeMillis - ((Long) AbstractC17254e.appmetrica.ad(null)).longValue();
                    while (i < m2825e && c15398e.crashlytics(longValue, null)) {
                        i++;
                    }
                } else {
                    c15398e.m3958package();
                    long intValue = ((Integer) AbstractC17254e.advert.ad(null)).intValue();
                    while (i < intValue && c15398e.crashlytics(0L, str)) {
                        i++;
                    }
                }
                if (c15398e.m3958package().m2822e(null, AbstractC17254e.f33814e)) {
                    c15398e.mo2262e().mo2250e();
                    c15398e.subs();
                }
                C0346e c0346e = c15398e.f30354e;
                int vip = AbstractC1414e.vip(c8019e.f16293e);
                c0346e.mo2250e();
                if (vip != 2 || C0346e.m331e(str)) {
                    return;
                }
                C10961e c10961e = c0346e.f19060e.f30382e;
                C15398e.m3939break(c10961e);
                C10110e m2965e = c10961e.m2965e(str);
                if (m2965e == null || !m2965e.m2770this() || m2965e.m2768native().tapsense().isEmpty()) {
                    return;
                }
                c15398e.mo2261e().f27497e.vip(str, "[sgtm] Going background, trigger client side upload. appId");
                c15398e.mo2259e().getClass();
                c15398e.smaato(System.currentTimeMillis(), str);
                return;
            case 2:
                BinderC14884e binderC14884e3 = this.f17374e;
                binderC14884e3.metrica.m3946default();
                C15398e c15398e2 = binderC14884e3.metrica;
                c15398e2.mo2262e().mo2250e();
                c15398e2.m3947else();
                C8019e c8019e2 = this.f17375e;
                AbstractC9528e.purchase(c8019e2.f16300e);
                c15398e2.m3962strictfp(c8019e2);
                return;
            case 3:
                BinderC14884e binderC14884e4 = this.f17374e;
                binderC14884e4.metrica.m3946default();
                C15398e c15398e3 = binderC14884e4.metrica;
                if (c15398e3.f30370e != null) {
                    ArrayList arrayList = new ArrayList();
                    c15398e3.f30367e = arrayList;
                    arrayList.addAll(c15398e3.f30370e);
                }
                C1248e c1248e = c15398e3.f30353e;
                C15398e.m3939break(c1248e);
                C6936e c6936e = (C6936e) c1248e.f36443e;
                C8019e c8019e3 = this.f17375e;
                String str2 = c8019e3.f16300e;
                AbstractC9528e.startapp(str2);
                AbstractC9528e.purchase(str2);
                c1248e.mo2250e();
                c1248e.m613e();
                try {
                    SQLiteDatabase m533e = c1248e.m533e();
                    String[] strArr = {str2};
                    int delete = m533e.delete("apps", "app_id=?", strArr) + m533e.delete("events", "app_id=?", strArr) + m533e.delete("events_snapshot", "app_id=?", strArr) + m533e.delete("user_attributes", "app_id=?", strArr) + m533e.delete("conditional_properties", "app_id=?", strArr) + m533e.delete("raw_events", "app_id=?", strArr) + m533e.delete("raw_events_metadata", "app_id=?", strArr) + m533e.delete("queue", "app_id=?", strArr) + m533e.delete("audience_filter_values", "app_id=?", strArr) + m533e.delete("main_event_params", "app_id=?", strArr) + m533e.delete("default_event_params", "app_id=?", strArr) + m533e.delete("trigger_uris", "app_id=?", strArr) + m533e.delete("upload_queue", "app_id=?", strArr);
                    if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33824e)) {
                        delete += m533e.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + m533e.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        C13879e c13879e = c6936e.f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27497e.metrica(str2, Integer.valueOf(delete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.metrica(C13879e.m3689e(str2), e, "Error resetting analytics data. appId, error");
                }
                if (c8019e3.f16287e) {
                    c15398e3.m3943catch(c8019e3);
                    return;
                }
                return;
            case 4:
                BinderC14884e binderC14884e5 = this.f17374e;
                binderC14884e5.metrica.m3946default();
                C15398e c15398e4 = binderC14884e5.metrica;
                c15398e4.mo2262e().mo2250e();
                c15398e4.m3947else();
                C8019e c8019e4 = this.f17375e;
                AbstractC9528e.purchase(c8019e4.f16300e);
                c15398e4.m3964switch(c8019e4);
                c15398e4.m3968throws(c8019e4);
                return;
            case 5:
                C15398e c15398e5 = this.f17374e.metrica;
                c15398e5.m3946default();
                c15398e5.m3968throws(this.f17375e);
                return;
            default:
                C15398e c15398e6 = this.f17374e.metrica;
                c15398e6.m3946default();
                c15398e6.m3964switch(this.f17375e);
                return;
        }
    }
}
