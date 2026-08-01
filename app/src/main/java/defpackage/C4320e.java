package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4320e extends AbstractC16997e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final /* synthetic */ int f9432e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f9433e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f9434e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f9435e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f9436e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f9437e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f9438e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f9439e;

    public C4320e() {
        super(false, 3);
        this.f9434e = AbstractC14533e.startapp(null);
        this.f9436e = AbstractC14533e.startapp("Untitled");
        this.f9439e = AbstractC14533e.startapp("Unknown Artist");
        this.f9433e = AbstractC14533e.startapp(null);
        Boolean bool = Boolean.FALSE;
        this.f9435e = AbstractC14533e.startapp(bool);
        this.f9437e = AbstractC14533e.startapp(bool);
        this.f9438e = AbstractC14533e.startapp(bool);
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        Bitmap bitmap = (Bitmap) this.f9433e.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
        File inmobi = inmobi();
        if (inmobi != null) {
            inmobi.delete();
        }
    }

    public final File inmobi() {
        return (File) this.f9434e.getValue();
    }

    public final void isVip(C13770e c13770e, int i) {
        Object c8841e;
        C4320e c4320e;
        c13770e.m3671package(1817858414);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            C6260e c6260e3 = new C6260e();
            C12380e tapsense = AbstractC12947e.tapsense((String) this.f9436e.getValue(), c13770e, 2);
            C12380e tapsense2 = AbstractC12947e.tapsense((String) this.f9439e.getValue(), c13770e, 2);
            InterfaceC16054e interfaceC16054e = (InterfaceC16054e) c13770e.adcel(AbstractC11473e.startapp);
            boolean purchase = c13770e.purchase(tapsense) | c13770e.purchase(tapsense2) | c13770e.yandex(interfaceC16054e) | c13770e.purchase(c6260e2) | c13770e.purchase(c6260e3) | c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                c8841e = new C8841e(tapsense, tapsense2, interfaceC16054e, c6260e2, c6260e3, this, 2);
                c4320e = this;
                c13770e.m3682throws(c8841e);
            } else {
                c8841e = m3681throw2;
                c4320e = this;
            }
            Function0 function0 = (Function0) c8841e;
            boolean yandex = c13770e.yandex(c4320e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == c5170e) {
                m3681throw3 = new C9949e(c4320e, 3);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC9262e.ad((Function0) m3681throw3, AbstractC16653e.license(-1466282058, new C18522e(13, function0, tapsense, tapsense2), c13770e), null, AbstractC16653e.license(132867000, new C3580e(c4320e, 5), c13770e), null, AbstractC9528e.metrica, AbstractC16653e.license(-1763376709, new C0773e(c6260e3, c6260e2, tapsense, function0, tapsense2, 6), c13770e), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3580e(this, i, 6);
        }
    }

    @Override // defpackage.AbstractC5004e
    public final void startapp(int i, int i2, Intent intent) {
        AbstractC9600e abstractC9600e;
        Activity activity = this.f10582e;
        if (i == 101) {
            abstractC9600e = C14908e.appmetrica;
            if (i2 != -1 || intent == null) {
                abstractC9600e = C14908e.purchase;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    try {
                        InputStream openInputStream = activity.getApplication().getContentResolver().openInputStream(data);
                        if (openInputStream != null) {
                            abstractC9600e = new C12538e(openInputStream);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            abstractC9600e = C14908e.license;
        }
        if (abstractC9600e instanceof C12538e) {
            InputStream inputStream = ((C12538e) abstractC9600e).license;
            VKXApplication vKXApplication = VKXApplication.f36528e;
            InterfaceC5083e interfaceC5083e = null;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            File file = new File(vKXApplication.getDir("artworkCache", 0), "VKXAudioUpload.mp3");
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            AbstractC13671e.license(inputStream, bufferedOutputStream);
            bufferedOutputStream.close();
            inputStream.close();
            C0576e c0576e = this.f9434e;
            c0576e.setValue(file);
            if (inmobi() != null) {
                AbstractC16519e.vip((AppActivity) this.f10582e, new C17071e(this, interfaceC5083e, 7));
                return;
            }
            C0576e c0576e2 = this.f9433e;
            Bitmap bitmap = (Bitmap) c0576e2.getValue();
            if (bitmap != null) {
                bitmap.recycle();
            }
            c0576e2.setValue(null);
            c0576e.setValue(null);
            this.f9436e.setValue("Untitled");
            this.f9439e.setValue("Unknown artist");
        }
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(1653191775);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            if (((Boolean) this.f9435e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-153687632);
                isVip(c13770e, i2 & 14);
            } else {
                c13770e.m3676strictfp(-165566429);
            }
            c13770e.Signature(false);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(508522618, new C3580e(this, 3), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3580e(this, i, 4);
        }
    }
}
