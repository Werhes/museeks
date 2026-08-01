package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3925e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f8767e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public IconCompat f8768e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public IconCompat f8769e;

    @Override // defpackage.Cpackage
    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final String mo1406e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.Cpackage
    /* renamed from: eٖؓٚ, reason: contains not printable characters */
    public final void mo1407e(C11467e c11467e) {
        Bitmap metrica;
        Context context = (Context) c11467e.f23072e;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) c11467e.f23070e).setBigContentTitle(null);
        IconCompat iconCompat = this.f8768e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0350e.ad(bigContentTitle, iconCompat.adcel(context));
            } else if (iconCompat.billing() == 1) {
                IconCompat iconCompat2 = this.f8768e;
                int i = iconCompat2.ad;
                if (i == -1) {
                    Object obj = iconCompat2.vip;
                    metrica = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    metrica = (Bitmap) iconCompat2.vip;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    metrica = IconCompat.metrica((Bitmap) iconCompat2.vip, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(metrica);
            }
        }
        if (this.f8767e) {
            IconCompat iconCompat3 = this.f8769e;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.adcel(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0350e.metrica(bigContentTitle, false);
            AbstractC0350e.vip(bigContentTitle, null);
        }
    }
}
