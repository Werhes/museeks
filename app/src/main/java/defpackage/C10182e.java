package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10182e implements InterfaceC3440e, InterfaceC17847e, InterfaceC5276e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f20137e;

    public /* synthetic */ C10182e(Object obj) {
        this.f20137e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        BinderC15126e binderC15126e = new BinderC15126e((C4480e) this.f20137e, (C8988e) obj2);
        C11544e c11544e = (C11544e) ((C8819e) obj).loadAd();
        Parcel m4156e = c11544e.m4156e();
        AbstractC3336e.metrica(m4156e, binderC15126e);
        c11544e.m4155e(m4156e, 2);
    }

    @Override // defpackage.InterfaceC5276e
    public Rect ad() {
        C5053e c5053e = (C5053e) this.f20137e;
        if (c5053e.f10844e == null) {
            return null;
        }
        int i = 0;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c5053e.f10844e;
            if (i >= pointArr.length) {
                return new Rect(i3, i4, i2, i5);
            }
            Point point = pointArr[i];
            i3 = Math.min(i3, point.x);
            i2 = Math.max(i2, point.x);
            i4 = Math.min(i4, point.y);
            i5 = Math.max(i5, point.y);
            i++;
        }
    }

    @Override // defpackage.InterfaceC5276e
    public Point[] appmetrica() {
        return ((C5053e) this.f20137e).f10844e;
    }

    @Override // defpackage.InterfaceC5276e
    public int getFormat() {
        return ((C5053e) this.f20137e).f10858e;
    }

    public void license() {
        C5710e c5710e = (C5710e) this.f20137e;
        Iterator it = c5710e.billing.iterator();
        if (it.hasNext()) {
            throw AbstractC5087e.m1747goto(it);
        }
        Iterator it2 = c5710e.yandex.iterator();
        while (it2.hasNext()) {
            C8327e c8327e = (C8327e) it2.next();
            switch (c8327e.ad) {
                case 2:
                    ((C6639e) c8327e.vip).vip();
                    break;
            }
        }
    }

    @Override // defpackage.InterfaceC5276e
    public int metrica() {
        return ((C5053e) this.f20137e).f10856e;
    }

    @Override // defpackage.InterfaceC3440e
    public void pro(Bundle bundle) {
        ((InterfaceC11335e) this.f20137e).mo659e();
    }

    @Override // defpackage.InterfaceC3440e
    public void remoteconfig(int i) {
        ((InterfaceC11335e) this.f20137e).remoteconfig(i);
    }

    @Override // defpackage.InterfaceC5276e
    public String vip() {
        return ((C5053e) this.f20137e).f10850e;
    }
}
