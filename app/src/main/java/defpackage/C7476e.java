package defpackage;

import android.widget.SeekBar;
import androidx.mediarouter.app.license;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۜۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7476e implements SeekBar.OnSeekBarChangeListener {
    public final RunnableC12991e ad = new RunnableC12991e(21, this);
    public final /* synthetic */ license vip;

    public C7476e(license licenseVar) {
        this.vip = licenseVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C6541e c6541e = (C6541e) seekBar.getTag();
            int i2 = license.f473e;
            c6541e.adcel(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        license licenseVar = this.vip;
        if (licenseVar.f487e != null) {
            licenseVar.f529e.removeCallbacks(this.ad);
        }
        licenseVar.f487e = (C6541e) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.vip.f529e.postDelayed(this.ad, 500L);
    }
}
