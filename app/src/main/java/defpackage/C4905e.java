package defpackage;

import android.content.Intent;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4905e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10399e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C5769e f10400e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f10401e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public File f10402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4905e(C5769e c5769e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10399e = i;
        this.f10400e = c5769e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10399e) {
            case 0:
                return new C4905e(this.f10400e, interfaceC5083e, 0);
            default:
                return new C4905e(this.f10400e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f10399e) {
            case 0:
                return ((C4905e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4905e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        File file;
        File file2;
        int i = this.f10399e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C5769e c5769e = this.f10400e;
        switch (i) {
            case 0:
                int i2 = this.f10401e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    File dir = c5769e.f27451e.getDir("ocshare", 0);
                    dir.mkdirs();
                    file = new File(dir, "OcCollectedBugReports.zip");
                    C15420e c15420e = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                    C0828e c0828e = new C0828e(file, null, 0);
                    this.f10402e = file;
                    this.f10401e = 1;
                    if (AbstractC5336e.advert(executorC3603e, c0828e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = this.f10402e;
                    AbstractC2003e.purchase(obj);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/zip");
                intent.setFlags(1);
                StringBuilder sb = new StringBuilder("[OrbitCore-CrashReporting] Collected ");
                C7546e c7546e = C11102e.ad;
                sb.append(C11102e.purchase());
                sb.append(" logs for ua.itaysonlab.vkx");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                intent.putExtra("android.intent.extra.STREAM", FileProvider.license(c5769e.f27451e, file));
                c5769e.pro().startActivity(Intent.createChooser(intent, c5769e.pro().getResources().getText(R.string.share)));
                return Unit.INSTANCE;
            default:
                int i3 = this.f10401e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    File dir2 = c5769e.f27451e.getDir("ocshare", 0);
                    dir2.mkdirs();
                    file2 = new File(dir2, "OcCollectedLogcat.txt");
                    C15420e c15420e2 = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e2 = ExecutorC3603e.f8134e;
                    C0828e c0828e2 = new C0828e(file2, null, 1);
                    this.f10402e = file2;
                    this.f10401e = 1;
                    if (AbstractC5336e.advert(executorC3603e2, c0828e2, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file2 = this.f10402e;
                    AbstractC2003e.purchase(obj);
                }
                Runtime.getRuntime().exec("logcat -d -f " + file2.getAbsolutePath());
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.setFlags(1);
                intent2.putExtra("android.intent.extra.TEXT", "[OrbitCore-CrashReporting] Logcat for ua.itaysonlab.vkx");
                intent2.putExtra("android.intent.extra.STREAM", FileProvider.license(c5769e.f27451e, file2));
                c5769e.pro().startActivity(Intent.createChooser(intent2, c5769e.pro().getResources().getText(R.string.share)));
                return Unit.INSTANCE;
        }
    }
}
