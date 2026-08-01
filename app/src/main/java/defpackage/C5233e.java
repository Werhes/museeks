package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5233e {
    public final Context ad;
    public final C5363e appmetrica;
    public final C5363e license;
    public final int metrica = Process.myPid();
    public boolean purchase;
    public final C5363e vip;

    public C5233e(Context context, C10618e c10618e) {
        this.ad = context;
        final int i = 0;
        this.vip = new C5363e(new Function0(this) { // from class: eّْٛ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C5233e f26618e;

            {
                this.f26618e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((C2039e) this.f26618e.appmetrica.getValue()).ad;
                    default:
                        return AbstractC14380e.advert(this.f26618e.ad);
                }
            }
        });
        this.license = new C5363e(new C13465e(15, c10618e));
        final int i2 = 1;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eّْٛ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C5233e f26618e;

            {
                this.f26618e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((C2039e) this.f26618e.appmetrica.getValue()).ad;
                    default:
                        return AbstractC14380e.advert(this.f26618e.ad);
                }
            }
        });
    }

    public final String ad() {
        return (String) this.vip.getValue();
    }

    public final Map vip(Map map) {
        C5363e c5363e = this.license;
        if (map == null) {
            return Collections.singletonMap(ad(), new C17545e(Process.myPid(), (String) c5363e.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(ad(), new C17545e(Process.myPid(), (String) c5363e.getValue()));
        return AbstractC10064e.advert(linkedHashMap);
    }
}
