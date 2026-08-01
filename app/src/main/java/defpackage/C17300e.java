package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17300e implements InterfaceC9550e {
    public final InterfaceC2531e ad;
    public final boolean appmetrica;
    public C1385e billing;
    public boolean license;
    public C4052e purchase;
    public final C5363e vip = new C5363e(new C2899e(8, this));
    public final C12382e metrica = new C9556e(3, new C2864e(16));

    /* JADX WARN: Type inference failed for: r3v3, types: [eٌٍٚ, eٍّٜ] */
    public C17300e(C13825e c13825e) {
        this.ad = c13825e.vip;
        this.appmetrica = AbstractC16338e.ad(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.InterfaceC9550e
    public final void ad() {
        purchase();
    }

    @Override // defpackage.InterfaceC9550e
    public final boolean appmetrica(AbstractC5113e abstractC5113e, C11469e c11469e) {
        Size size = abstractC5113e.yandex;
        InputConfiguration inputConfiguration = c11469e.startapp;
        return inputConfiguration != null && abstractC5113e.startapp == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    @Override // defpackage.InterfaceC9550e
    public final void license(boolean z) {
        if (this.license != z && z) {
            while (true) {
                C12382e c12382e = this.metrica;
                if (c12382e.m2614extends()) {
                    break;
                } else {
                    ((InterfaceC12385e) c12382e.mopub()).close();
                }
            }
        }
        this.license = z;
    }

    @Override // defpackage.InterfaceC9550e
    public final void metrica(boolean z) {
    }

    public final void purchase() {
        C1385e c1385e = this.billing;
        if (c1385e != null) {
            C4052e c4052e = this.purchase;
            if (c4052e != null) {
                AbstractC15792e.smaato(c1385e.appmetrica).ad(new RunnableC11991e(c4052e, 4), AbstractC3062e.amazon());
                c4052e.billing();
                this.purchase = null;
            }
            c1385e.ad();
            this.billing = null;
        }
        while (true) {
            C12382e c12382e = this.metrica;
            if (c12382e.m2614extends()) {
                return;
            } else {
                ((InterfaceC12385e) c12382e.mopub()).close();
            }
        }
    }

    @Override // defpackage.InterfaceC9550e
    public final void vip(C16990e c16990e) {
        C10379e c10379e = c16990e.vip;
        purchase();
        if (this.license) {
            c10379e.f20509e = 1;
            return;
        }
        if (this.appmetrica) {
            c10379e.f20509e = 1;
            return;
        }
        InterfaceC2531e.yandex.getClass();
        int[] iArr = (int[]) ((C9000e) this.ad).metrica(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = C6434e.vip;
        }
        if (!AbstractC1660e.startapp(iArr, 4)) {
            if (AbstractC9464e.loadAd()) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            c10379e.f20509e = 1;
            return;
        }
        C5363e c5363e = this.vip;
        Iterator it = AbstractC1660e.m670implements(((StreamConfigurationMap) c5363e.getValue()).getInputSizes(34)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (AbstractC9464e.admob()) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (AbstractC9464e.smaato("CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        if (!AbstractC1660e.startapp(((StreamConfigurationMap) c5363e.getValue()).getValidOutputFormatsForInput(34), PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            if (AbstractC9464e.admob()) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        C8402e c8402e = new C8402e(size3.getWidth(), size3.getHeight(), 34, 9);
        C4052e c4052e = new C4052e(c8402e);
        c8402e.pro(new C13087e(this), AbstractC3062e.smaato());
        Surface surface = c4052e.getSurface();
        if (surface == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C1385e c1385e = new C1385e(surface, new Size(c4052e.getWidth(), c4052e.vip()), 34);
        AbstractC15792e.smaato(c1385e.appmetrica).ad(new RunnableC11991e(c4052e, 3), AbstractC3062e.amazon());
        c16990e.vip(c1385e, C14677e.license, -1);
        C11606e c11606e = c8402e.f17175e;
        c10379e.amazon(c11606e);
        ArrayList arrayList = c16990e.appmetrica;
        if (!arrayList.contains(c11606e)) {
            arrayList.add(c11606e);
        }
        c16990e.billing = new InputConfiguration(c4052e.getWidth(), c4052e.vip(), c4052e.appmetrica());
        this.purchase = c4052e;
        this.billing = c1385e;
    }
}
