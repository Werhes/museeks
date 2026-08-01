package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.appmetrica;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۤٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14356e implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ DialogC1747e ad;

    public C14356e(DialogC1747e dialogC1747e) {
        this.ad = dialogC1747e;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C6541e c6541e = (C6541e) seekBar.getTag();
            appmetrica appmetricaVar = (appmetrica) this.ad.f4778e.get(c6541e.metrica);
            if (appmetricaVar != null) {
                appmetricaVar.pro(i == 0);
            }
            c6541e.adcel(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DialogC1747e dialogC1747e = this.ad;
        if (dialogC1747e.f4781e != null) {
            dialogC1747e.f4775e.removeMessages(2);
        }
        dialogC1747e.f4781e = (C6541e) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.ad.f4775e.sendEmptyMessageDelayed(2, 500L);
    }
}
