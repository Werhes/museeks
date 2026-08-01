package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3432e implements InterfaceC7898e, InterfaceC5276e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f7689e;

    public /* synthetic */ C3432e(Object obj) {
        this.f7689e = obj;
    }

    @Override // defpackage.InterfaceC5276e
    public Rect ad() {
        Point[] pointArr = ((C16353e) this.f7689e).f32136e;
        if (pointArr == null) {
            return null;
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    @Override // defpackage.InterfaceC5276e
    public Point[] appmetrica() {
        return ((C16353e) this.f7689e).f32136e;
    }

    @Override // defpackage.InterfaceC5276e
    public int getFormat() {
        return ((C16353e) this.f7689e).f32148e;
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        ((C8130e) this.f7689e).getClass();
    }

    @Override // defpackage.InterfaceC5276e
    public int metrica() {
        return ((C16353e) this.f7689e).f32150e;
    }

    public void purchase(int i, String str, List list, boolean z, boolean z2) {
        C14937e c14937e;
        C10961e c10961e = (C10961e) this.f7689e;
        int i2 = i - 1;
        if (i2 == 0) {
            C13879e c13879e = ((C6936e) c10961e.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c14937e = c13879e.f27496e;
        } else if (i2 != 1) {
            if (i2 == 3) {
                C13879e c13879e2 = ((C6936e) c10961e.f36443e).f14227e;
                C6936e.yandex(c13879e2);
                c14937e = c13879e2.f27497e;
            } else if (i2 != 4) {
                C13879e c13879e3 = ((C6936e) c10961e.f36443e).f14227e;
                C6936e.yandex(c13879e3);
                c14937e = c13879e3.f27493e;
            } else if (z) {
                C13879e c13879e4 = ((C6936e) c10961e.f36443e).f14227e;
                C6936e.yandex(c13879e4);
                c14937e = c13879e4.f27499e;
            } else if (z2) {
                C13879e c13879e5 = ((C6936e) c10961e.f36443e).f14227e;
                C6936e.yandex(c13879e5);
                c14937e = c13879e5.f27495e;
            } else {
                C13879e c13879e6 = ((C6936e) c10961e.f36443e).f14227e;
                C6936e.yandex(c13879e6);
                c14937e = c13879e6.f27494e;
            }
        } else if (z) {
            C13879e c13879e7 = ((C6936e) c10961e.f36443e).f14227e;
            C6936e.yandex(c13879e7);
            c14937e = c13879e7.f27498e;
        } else if (z2) {
            C13879e c13879e8 = ((C6936e) c10961e.f36443e).f14227e;
            C6936e.yandex(c13879e8);
            c14937e = c13879e8.f27502e;
        } else {
            C13879e c13879e9 = ((C6936e) c10961e.f36443e).f14227e;
            C6936e.yandex(c13879e9);
            c14937e = c13879e9.f27501e;
        }
        int size = list.size();
        if (size == 1) {
            c14937e.vip(list.get(0), str);
            return;
        }
        if (size == 2) {
            c14937e.metrica(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c14937e.ad(str);
        } else {
            c14937e.license(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // defpackage.InterfaceC5276e
    public String vip() {
        return ((C16353e) this.f7689e).f32139e;
    }
}
