package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.vip;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.license;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC13605e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ license f26988e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26989e;

    public /* synthetic */ ViewOnClickListenerC13605e(license licenseVar, int i) {
        this.f26989e = i;
        this.f26988e = licenseVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        switch (this.f26989e) {
            case 0:
                license licenseVar = this.f26988e;
                Context context = licenseVar.f506e;
                AccessibilityManager accessibilityManager = licenseVar.f483e;
                int id = view.getId();
                if (id == 16908313 || id == 16908314) {
                    if (licenseVar.f477e.billing()) {
                        C10085e c10085e = licenseVar.f501e;
                        i = id == 16908313 ? 2 : 1;
                        c10085e.getClass();
                        C10085e.adcel(i);
                    }
                    licenseVar.dismiss();
                    return;
                }
                if (id != R.id.mr_control_playback_ctrl) {
                    if (id == R.id.mr_close) {
                        licenseVar.dismiss();
                        return;
                    }
                    return;
                }
                C11883e c11883e = licenseVar.f533e;
                if (c11883e == null || (playbackStateCompat = licenseVar.f497e) == null) {
                    return;
                }
                int i2 = 0;
                i = playbackStateCompat.f50e != 3 ? 0 : 1;
                if (i != 0 && (playbackStateCompat.f41e & 514) != 0) {
                    c11883e.advert().ad.pause();
                    i2 = R.string.mr_controller_pause;
                } else if (i != 0 && (playbackStateCompat.f41e & 1) != 0) {
                    c11883e.advert().ad.stop();
                    i2 = R.string.mr_controller_stop;
                } else if (i == 0 && (playbackStateCompat.f41e & 516) != 0) {
                    c11883e.advert().ad.play();
                    i2 = R.string.mr_controller_play;
                }
                if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
                    return;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.setPackageName(context.getPackageName());
                obtain.setClassName(ViewOnClickListenerC13605e.class.getName());
                obtain.getText().add(context.getString(i2));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            case 1:
                this.f26988e.dismiss();
                return;
            case 2:
                license licenseVar2 = this.f26988e;
                C11883e c11883e2 = licenseVar2.f533e;
                if (c11883e2 == null || (sessionActivity = ((vip) c11883e2.f23815e).ad.getSessionActivity()) == null) {
                    return;
                }
                try {
                    sessionActivity.send();
                    licenseVar2.dismiss();
                    return;
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                    return;
                }
            default:
                license licenseVar3 = this.f26988e;
                boolean z = licenseVar3.f482e;
                licenseVar3.f482e = !z;
                if (!z) {
                    licenseVar3.f489e.setVisibility(0);
                }
                licenseVar3.f485e = licenseVar3.f482e ? licenseVar3.f480e : licenseVar3.f502e;
                licenseVar3.isVip(true);
                return;
        }
    }
}
