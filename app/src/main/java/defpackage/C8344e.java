package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.mopub;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8344e implements InterfaceC13619e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17077e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17078e;

    public /* synthetic */ C8344e(int i, Object obj) {
        this.f17078e = i;
        this.f17077e = obj;
    }

    public C8344e(EmojiCompatInitializer emojiCompatInitializer, AbstractC0003e abstractC0003e) {
        this.f17078e = 1;
        this.f17077e = abstractC0003e;
    }

    private final /* synthetic */ void ad() {
    }

    private final /* synthetic */ void adcel(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void admob(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void advert(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void amazon(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void appmetrica(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void billing(InterfaceC16400e interfaceC16400e) {
    }

    private final void license() {
    }

    private final /* synthetic */ void loadAd(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void metrica() {
    }

    private final /* synthetic */ void mopub(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void smaato(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void startapp(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void subscription(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void vip() {
    }

    private final /* synthetic */ void yandex(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onDestroy(InterfaceC16400e interfaceC16400e) {
        switch (this.f17078e) {
            case 0:
                mopub mopubVar = (mopub) this.f17077e;
                AbstractC14524e.ad();
                mopubVar.ad = null;
                mopubVar.vip = null;
                mopubVar.license = null;
                interfaceC16400e.vip().vip(this);
                return;
            case 1:
            case 2:
                return;
            case 3:
                ArrayDeque arrayDeque = ((C18047e) this.f17077e).ad;
                Iterator it = new ArrayDeque(arrayDeque).iterator();
                while (it.hasNext()) {
                    C18047e.vip((C6436e) it.next(), true);
                }
                arrayDeque.clear();
                interfaceC16400e.vip().vip(this);
                return;
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_DESTROY);
                interfaceC16400e.vip().vip(this);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onPause(InterfaceC16400e interfaceC16400e) {
        switch (this.f17078e) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                C6436e c6436e = (C6436e) ((C18047e) this.f17077e).ad.peek();
                if (c6436e == null) {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
                    return;
                } else {
                    c6436e.metrica(EnumC14621e.ON_PAUSE);
                    return;
                }
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_PAUSE);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onResume(InterfaceC16400e interfaceC16400e) {
        switch (this.f17078e) {
            case 0:
                return;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1780e.ad(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC18182e(0), 500L);
                ((AbstractC0003e) this.f17077e).vip(this);
                return;
            case 2:
                return;
            case 3:
                C6436e c6436e = (C6436e) ((C18047e) this.f17077e).ad.peek();
                if (c6436e == null) {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
                    return;
                } else {
                    c6436e.metrica(EnumC14621e.ON_RESUME);
                    return;
                }
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_RESUME);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStart(InterfaceC16400e interfaceC16400e) {
        switch (this.f17078e) {
            case 0:
            case 1:
                return;
            case 2:
                ((C13578e) this.f17077e).billing(Unit.INSTANCE);
                return;
            case 3:
                C6436e c6436e = (C6436e) ((C18047e) this.f17077e).ad.peek();
                if (c6436e == null) {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
                    return;
                } else {
                    c6436e.metrica(EnumC14621e.ON_START);
                    return;
                }
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_START);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        switch (this.f17078e) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                C6436e c6436e = (C6436e) ((C18047e) this.f17077e).ad.peek();
                if (c6436e == null) {
                    Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
                    return;
                } else {
                    c6436e.metrica(EnumC14621e.ON_STOP);
                    return;
                }
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_STOP);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void purchase() {
        switch (this.f17078e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((AbstractC2731e) this.f17077e).f6630e.appmetrica(EnumC14621e.ON_CREATE);
                return;
        }
    }
}
