package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6592e extends AbstractC9882e {
    public final /* synthetic */ C6639e billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6592e(C6639e c6639e) {
        super(1);
        Objects.requireNonNull(c6639e);
        this.billing = c6639e;
    }

    @Override // defpackage.AbstractC9882e
    public final boolean adcel(Intent intent) {
        C5710e c5710e;
        C6639e.tapsense.vip("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (c5710e = this.billing.amazon) == null) {
            return true;
        }
        c5710e.advert();
        return true;
    }

    @Override // defpackage.AbstractC9882e
    public final void ads(long j) {
        C18482e c18482e = C6639e.tapsense;
        C6639e.tapsense.vip("onSeekTo %d", Long.valueOf(j));
        C5710e c5710e = this.billing.amazon;
        if (c5710e == null) {
            return;
        }
        C18076e c18076e = new C18076e(j);
        AbstractC9528e.appmetrica();
        if (c5710e.admob()) {
            C5710e.subscription(new C3722e(c5710e, c18076e));
        } else {
            C5710e.Signature();
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void advert() {
        C6639e.tapsense.vip("onPause", new Object[0]);
        C5710e c5710e = this.billing.amazon;
        if (c5710e != null) {
            c5710e.advert();
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void billing(String str) {
        C6639e.tapsense.vip("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        C6639e c6639e = this.billing;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j = -c6639e.appmetrica.f4690e;
                    C5710e c5710e = c6639e.amazon;
                    if (c5710e == null) {
                        return;
                    }
                    long min = Math.min(c5710e.appmetrica(), Math.max(0L, c5710e.ad() + j));
                    C5710e c5710e2 = c6639e.amazon;
                    if (c5710e2 == null) {
                        return;
                    }
                    C18076e c18076e = new C18076e(min);
                    AbstractC9528e.appmetrica();
                    if (c5710e2.admob()) {
                        C5710e.subscription(new C3722e(c5710e2, c18076e));
                        return;
                    } else {
                        C5710e.Signature();
                        return;
                    }
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    C14618e c14618e = c6639e.license;
                    if (c14618e != null) {
                        c14618e.vip(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    C14618e c14618e2 = c6639e.license;
                    if (c14618e2 != null) {
                        c14618e2.vip(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j2 = c6639e.appmetrica.f4690e;
                    C5710e c5710e3 = c6639e.amazon;
                    if (c5710e3 == null) {
                        return;
                    }
                    long min2 = Math.min(c5710e3.appmetrica(), Math.max(0L, c5710e3.ad() + j2));
                    C5710e c5710e4 = c6639e.amazon;
                    if (c5710e4 == null) {
                        return;
                    }
                    C18076e c18076e2 = new C18076e(min2);
                    AbstractC9528e.appmetrica();
                    if (c5710e4.admob()) {
                        C5710e.subscription(new C3722e(c5710e4, c18076e2));
                        return;
                    } else {
                        C5710e.Signature();
                        return;
                    }
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(c6639e.billing);
        int i = Build.VERSION.SDK_INT;
        Context context = c6639e.ad;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void loadAd() {
        C6639e.tapsense.vip("onPlay", new Object[0]);
        C5710e c5710e = this.billing.amazon;
        if (c5710e != null) {
            c5710e.advert();
        }
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: this */
    public final void mo1937this() {
        C6639e.tapsense.vip("onSkipToNext", new Object[0]);
        C5710e c5710e = this.billing.amazon;
        if (c5710e != null) {
            AbstractC9528e.appmetrica();
            if (c5710e.admob()) {
                C5710e.subscription(new C9883e(c5710e, 1, false));
            } else {
                C5710e.Signature();
            }
        }
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: throw */
    public final void mo1938throw() {
        C6639e.tapsense.vip("onSkipToPrevious", new Object[0]);
        C5710e c5710e = this.billing.amazon;
        if (c5710e != null) {
            AbstractC9528e.appmetrica();
            if (c5710e.admob()) {
                C5710e.subscription(new C9883e(c5710e, 0, false));
            } else {
                C5710e.Signature();
            }
        }
    }
}
