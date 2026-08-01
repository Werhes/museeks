package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.app.appmetrica;
import androidx.mediarouter.app.license;
import j$.util.DesugarCollections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132e extends AbstractC17065e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ KeyEvent.Callback vip;

    public /* synthetic */ C0132e(KeyEvent.Callback callback, int i) {
        this.ad = i;
        this.vip = callback;
    }

    @Override // defpackage.AbstractC17065e
    public void ad() {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void amazon(C16936e c16936e) {
        switch (this.ad) {
            case 0:
                boolean z = c16936e != null ? c16936e.appmetrica.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) this.vip;
                if (mediaRouteButton.f454e != z) {
                    mediaRouteButton.f454e = z;
                    mediaRouteButton.refreshDrawableState();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public final void appmetrica(C10085e c10085e, C6541e c6541e) {
        C14756e ad;
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            case 1:
                ((DialogC6627e) this.vip).mopub();
                return;
            case 2:
                ((license) this.vip).pro(true);
                return;
            case 3:
                ((DialogC6738e) this.vip).adcel();
                return;
            default:
                DialogC1747e dialogC1747e = (DialogC1747e) this.vip;
                if (c6541e == dialogC1747e.f4752e && C6541e.vip() != null) {
                    C9701e c9701e = c6541e.ad;
                    c9701e.getClass();
                    C10085e.vip();
                    for (C6541e c6541e2 : DesugarCollections.unmodifiableList(c9701e.vip)) {
                        if (!DesugarCollections.unmodifiableList(dialogC1747e.f4752e.tapsense).contains(c6541e2) && (ad = dialogC1747e.f4752e.ad()) != null && ad.loadAd(c6541e2) && !dialogC1747e.f4751e.contains(c6541e2)) {
                            dialogC1747e.subscription();
                            dialogC1747e.Signature();
                            return;
                        }
                    }
                }
                dialogC1747e.admob();
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void license(C10085e c10085e, C6541e c6541e) {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            case 1:
                ((DialogC6627e) this.vip).mopub();
                return;
            case 2:
            default:
                return;
            case 3:
                ((DialogC6738e) this.vip).adcel();
                return;
            case 4:
                ((DialogC1747e) this.vip).admob();
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void metrica() {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void mopub() {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            case 1:
            case 3:
            default:
                return;
            case 2:
                ((license) this.vip).pro(false);
                return;
            case 4:
                ((DialogC1747e) this.vip).admob();
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void smaato(C6541e c6541e) {
        appmetrica appmetricaVar;
        int i = this.ad;
        KeyEvent.Callback callback = this.vip;
        switch (i) {
            case 2:
                license licenseVar = (license) callback;
                SeekBar seekBar = (SeekBar) licenseVar.f523e.get(c6541e);
                int i2 = c6541e.Signature;
                int i3 = license.f473e;
                if (seekBar == null || licenseVar.f487e == c6541e) {
                    return;
                }
                seekBar.setProgress(i2);
                return;
            case 3:
            default:
                return;
            case 4:
                int i4 = DialogC1747e.f4748e;
                DialogC1747e dialogC1747e = (DialogC1747e) callback;
                if (dialogC1747e.f4781e == c6541e || (appmetricaVar = (appmetrica) dialogC1747e.f4778e.get(c6541e.metrica)) == null) {
                    return;
                }
                int i5 = appmetricaVar.signatures.Signature;
                appmetricaVar.pro(i5 == 0);
                appmetricaVar.isVip.setProgress(i5);
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void startapp(C6541e c6541e) {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            case 1:
                ((DialogC6627e) this.vip).dismiss();
                return;
            case 2:
            default:
                return;
            case 3:
                ((DialogC6738e) this.vip).dismiss();
                return;
            case 4:
                DialogC1747e dialogC1747e = (DialogC1747e) this.vip;
                dialogC1747e.f4752e = c6541e;
                dialogC1747e.subscription();
                dialogC1747e.Signature();
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void vip() {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC17065e
    public void yandex(C10085e c10085e, C6541e c6541e) {
        switch (this.ad) {
            case 0:
                ((MediaRouteButton) this.vip).vip();
                return;
            case 1:
                ((DialogC6627e) this.vip).mopub();
                return;
            case 2:
            default:
                return;
            case 3:
                ((DialogC6738e) this.vip).adcel();
                return;
            case 4:
                ((DialogC1747e) this.vip).admob();
                return;
        }
    }
}
