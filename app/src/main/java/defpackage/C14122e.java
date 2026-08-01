package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14122e extends AbstractC17065e {
    public static final C18482e license = new C18482e("MediaRouterCallback", null);
    public final C6506e ad;
    public final C9149e metrica;
    public final BinderC8922e vip;

    public C14122e(C6506e c6506e, BinderC8922e binderC8922e, C9149e c9149e) {
        AbstractC9528e.startapp(c6506e);
        this.ad = c6506e;
        this.vip = binderC8922e;
        this.metrica = c9149e;
    }

    @Override // defpackage.AbstractC17065e
    public final void adcel(C10085e c10085e, C6541e c6541e, int i, C6541e c6541e2) {
        int i2 = c6541e.advert;
        String str = c6541e.metrica;
        C18482e c18482e = license;
        if (i2 != 1) {
            Log.i(c18482e.ad, c18482e.license("ignore onRouteSelected for non-remote selected routeId: %s", str));
            return;
        }
        Log.i(c18482e.ad, c18482e.license("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            C6506e c6506e = this.ad;
            Parcel m4154e = c6506e.m4154e(c6506e.m4156e(), 7);
            int readInt = m4154e.readInt();
            m4154e.recycle();
            if (readInt >= 220400000) {
                String str2 = c6541e2.metrica;
                Bundle bundle = c6541e.remoteconfig;
                Parcel m4156e = c6506e.m4156e();
                m4156e.writeString(str2);
                m4156e.writeString(str);
                AbstractC3336e.vip(m4156e, bundle);
                c6506e.m4155e(m4156e, 8);
            } else {
                String str3 = c6541e2.metrica;
                Bundle bundle2 = c6541e.remoteconfig;
                Parcel m4156e2 = c6506e.m4156e();
                m4156e2.writeString(str3);
                AbstractC3336e.vip(m4156e2, bundle2);
                c6506e.m4155e(m4156e2, 4);
            }
        } catch (RemoteException e) {
            c18482e.ad(e, "Unable to call %s on %s.", "onRouteSelected", C6506e.class.getSimpleName());
        }
        loadAd(c10085e);
    }

    @Override // defpackage.AbstractC17065e
    public final void advert(C10085e c10085e, C6541e c6541e, int i) {
        int i2 = c6541e.advert;
        String str = c6541e.metrica;
        C18482e c18482e = license;
        if (i2 != 1) {
            Log.i(c18482e.ad, c18482e.license("ignore onRouteUnselected for non-remote routeId: %s", str));
            return;
        }
        Log.i(c18482e.ad, c18482e.license("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            C6506e c6506e = this.ad;
            Bundle bundle = c6541e.remoteconfig;
            Parcel m4156e = c6506e.m4156e();
            m4156e.writeString(str);
            AbstractC3336e.vip(m4156e, bundle);
            m4156e.writeInt(i);
            c6506e.m4155e(m4156e, 6);
        } catch (RemoteException e) {
            c18482e.ad(e, "Unable to call %s on %s.", "onRouteUnselected", C6506e.class.getSimpleName());
        }
        loadAd(c10085e);
    }

    @Override // defpackage.AbstractC17065e
    public final void appmetrica(C10085e c10085e, C6541e c6541e) {
        if (c6541e.billing()) {
            try {
                C6506e c6506e = this.ad;
                String str = c6541e.metrica;
                Bundle bundle = c6541e.remoteconfig;
                Parcel m4156e = c6506e.m4156e();
                m4156e.writeString(str);
                AbstractC3336e.vip(m4156e, bundle);
                c6506e.m4155e(m4156e, 2);
            } catch (RemoteException e) {
                license.ad(e, "Unable to call %s on %s.", "onRouteChanged", C6506e.class.getSimpleName());
            }
            loadAd(c10085e);
        }
    }

    @Override // defpackage.AbstractC17065e
    public final void billing(C6541e c6541e, C6541e c6541e2, int i) {
        String str = c6541e2.metrica;
        C18482e c18482e = license;
        if (c6541e != null) {
            String str2 = c6541e.metrica;
            if (c6541e.advert == 1) {
                Log.i(c18482e.ad, c18482e.license("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str2, str, Integer.valueOf(i)));
                this.vip.mopub = false;
                try {
                    C6506e c6506e = this.ad;
                    Parcel m4154e = c6506e.m4154e(c6506e.m4156e(), 7);
                    int readInt = m4154e.readInt();
                    m4154e.recycle();
                    if (readInt < 251600000) {
                        Bundle bundle = c6541e.remoteconfig;
                        Parcel m4156e = c6506e.m4156e();
                        m4156e.writeString(str2);
                        AbstractC3336e.vip(m4156e, bundle);
                        m4156e.writeInt(i);
                        c6506e.m4155e(m4156e, 6);
                        return;
                    }
                    Bundle bundle2 = c6541e.remoteconfig;
                    Parcel m4156e2 = c6506e.m4156e();
                    m4156e2.writeString(str);
                    m4156e2.writeString(str2);
                    AbstractC3336e.vip(m4156e2, bundle2);
                    m4156e2.writeInt(i);
                    c6506e.m4155e(m4156e2, 10);
                    return;
                } catch (RemoteException e) {
                    c18482e.ad(e, "Unable to call %s on %s.", "onRouteDisconnected", C6506e.class.getSimpleName());
                    return;
                }
            }
        }
        Log.i(c18482e.ad, c18482e.license("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]));
    }

    @Override // defpackage.AbstractC17065e
    public final void license(C10085e c10085e, C6541e c6541e) {
        try {
            C6506e c6506e = this.ad;
            String str = c6541e.metrica;
            Bundle bundle = c6541e.remoteconfig;
            Parcel m4156e = c6506e.m4156e();
            m4156e.writeString(str);
            AbstractC3336e.vip(m4156e, bundle);
            c6506e.m4155e(m4156e, 1);
        } catch (RemoteException e) {
            license.ad(e, "Unable to call %s on %s.", "onRouteAdded", C6506e.class.getSimpleName());
        }
        loadAd(c10085e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadAd(defpackage.C10085e r6) {
        /*
            r5 = this;
            eٌۨٙ r6 = r5.metrica
            if (r6 == 0) goto L93
            boolean r0 = r6.appmetrica
            if (r0 == 0) goto L93
            eؘّٕ r0 = r6.ad
            boolean r0 = r0.f25010e
            if (r0 == 0) goto L93
            eٍّٔ r6 = r6.purchase
            r0 = 0
            if (r6 == 0) goto L23
            defpackage.AbstractC9528e.appmetrica()
            eٌؒٞ r6 = r6.metrica()
            if (r6 == 0) goto L23
            boolean r1 = r6 instanceof defpackage.C10078e
            if (r1 == 0) goto L23
            eَؗۗ r6 = (defpackage.C10078e) r6
            goto L24
        L23:
            r6 = r0
        L24:
            if (r6 != 0) goto L2a
            defpackage.C10085e.startapp(r0)
            return
        L2a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            defpackage.C10085e.vip()
            eؙٓٛ r0 = defpackage.C10085e.metrica()
            java.util.ArrayList r0 = r0.startapp
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            eؙِٞ r1 = (defpackage.C6541e) r1
            android.os.Bundle r2 = r1.remoteconfig
            com.google.android.gms.cast.CastDevice r2 = com.google.android.gms.cast.CastDevice.billing(r2)
            if (r2 == 0) goto L3c
            eٕٗۧ r2 = new eٕٗۧ
            java.lang.String r1 = r1.metrica
            r2.<init>(r1)
            eٌِِ r1 = new eٌِِ
            r1.<init>(r2)
            r6.add(r1)
            goto L3c
        L60:
            eۥَ r0 = defpackage.C9149e.billing
            int r1 = r6.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "updateRouteListingPreference with %d available routes"
            r0.vip(r1, r3)
            eْْۚ r0 = new eْْۚ
            r0.<init>()
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.vip = r1
            r0.metrica = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.util.List r6 = j$.util.DesugarCollections.unmodifiableList(r1)
            r0.vip = r6
            eَ۠٘ r6 = new eَ۠٘
            r6.<init>(r0)
            defpackage.C10085e.startapp(r6)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14122e.loadAd(eَؘؑ):void");
    }

    @Override // defpackage.AbstractC17065e
    public final void purchase(C6541e c6541e, C6541e c6541e2) {
        String str = c6541e2.metrica;
        int i = c6541e.advert;
        String str2 = c6541e.metrica;
        C18482e c18482e = license;
        if (i != 1) {
            Log.i(c18482e.ad, c18482e.license("ignore onRouteConnected for non-remote connected routeId: %s", str2));
            return;
        }
        Log.i(c18482e.ad, c18482e.license("onRouteConnected with connectedRouteId = %s", str2));
        this.vip.mopub = true;
        try {
            C6506e c6506e = this.ad;
            Parcel m4154e = c6506e.m4154e(c6506e.m4156e(), 7);
            int readInt = m4154e.readInt();
            m4154e.recycle();
            if (readInt >= 251600000) {
                Bundle bundle = c6541e.remoteconfig;
                Parcel m4156e = c6506e.m4156e();
                m4156e.writeString(str);
                m4156e.writeString(str2);
                AbstractC3336e.vip(m4156e, bundle);
                c6506e.m4155e(m4156e, 9);
                return;
            }
            Bundle bundle2 = c6541e.remoteconfig;
            Parcel m4156e2 = c6506e.m4156e();
            m4156e2.writeString(str);
            m4156e2.writeString(str2);
            AbstractC3336e.vip(m4156e2, bundle2);
            c6506e.m4155e(m4156e2, 8);
        } catch (RemoteException e) {
            c18482e.ad(e, "Unable to call %s on %s.", "onRouteConnected", C6506e.class.getSimpleName());
        }
    }

    @Override // defpackage.AbstractC17065e
    public final void yandex(C10085e c10085e, C6541e c6541e) {
        try {
            C6506e c6506e = this.ad;
            String str = c6541e.metrica;
            Bundle bundle = c6541e.remoteconfig;
            Parcel m4156e = c6506e.m4156e();
            m4156e.writeString(str);
            AbstractC3336e.vip(m4156e, bundle);
            c6506e.m4155e(m4156e, 3);
        } catch (RemoteException e) {
            license.ad(e, "Unable to call %s on %s.", "onRouteRemoved", C6506e.class.getSimpleName());
        }
        loadAd(c10085e);
    }
}
