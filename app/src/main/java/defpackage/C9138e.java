package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9138e {
    public final Context ad;
    public EdgeEffect adcel;
    public EdgeEffect appmetrica;
    public EdgeEffect billing;
    public EdgeEffect license;
    public long metrica = 0;
    public EdgeEffect mopub;
    public EdgeEffect purchase;
    public EdgeEffect startapp;
    public final int vip;
    public EdgeEffect yandex;

    public C9138e(Context context, int i) {
        this.ad = context;
        this.vip = i;
    }

    public static boolean billing(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC16048e.amazon(edgeEffect) : 0.0f) == 0.0f);
    }

    public static boolean purchase(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect ad(EnumC17426e enumC17426e) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.ad;
        EdgeEffect vip = i >= 31 ? AbstractC16048e.vip(context) : new C1655e(context);
        vip.setColor(this.vip);
        if (!C12729e.vip(this.metrica, 0L)) {
            if (enumC17426e == EnumC17426e.f34146e) {
                long j = this.metrica;
                vip.setSize((int) (j >> 32), (int) (4294967295L & j));
                return vip;
            }
            long j2 = this.metrica;
            vip.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return vip;
    }

    public final EdgeEffect appmetrica() {
        EdgeEffect edgeEffect = this.license;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect ad = ad(EnumC17426e.f34146e);
        this.license = ad;
        return ad;
    }

    public final EdgeEffect license() {
        EdgeEffect edgeEffect = this.billing;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect ad = ad(EnumC17426e.f34145e);
        this.billing = ad;
        return ad;
    }

    public final EdgeEffect metrica() {
        EdgeEffect edgeEffect = this.purchase;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect ad = ad(EnumC17426e.f34145e);
        this.purchase = ad;
        return ad;
    }

    public final EdgeEffect vip() {
        EdgeEffect edgeEffect = this.appmetrica;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect ad = ad(EnumC17426e.f34146e);
        this.appmetrica = ad;
        return ad;
    }
}
