package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3211e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ File f3212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0828e(File file, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3211e = i;
        this.f3212e = file;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3211e) {
            case 0:
                return new C0828e(this.f3212e, interfaceC5083e, 0);
            default:
                return new C0828e(this.f3212e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3211e) {
            case 0:
                return ((C0828e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0828e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f3211e) {
            case 0:
                AbstractC2003e.purchase(obj);
                File file = this.f3212e;
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                C10675e c10675e = C11102e.metrica;
                if (c10675e != null) {
                    File file2 = c10675e.toFile();
                    ZipOutputStream zipOutputStream = null;
                    try {
                        ZipOutputStream zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 2048));
                        try {
                            if (file2.isDirectory()) {
                                AbstractC0083e.m240import(zipOutputStream2, file2, file2.getParent().length());
                            } else {
                                byte[] bArr = new byte[2048];
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 2048);
                                String[] strArr = (String[]) AbstractC5304e.m1869private(file2.getPath(), new String[]{"/"}, 6).toArray(new String[0]);
                                ZipEntry zipEntry = new ZipEntry(strArr.length == 0 ? BuildConfig.FLAVOR : strArr[strArr.length - 1]);
                                zipEntry.setTime(file2.lastModified());
                                zipOutputStream2.putNextEntry(zipEntry);
                                for (int read = bufferedInputStream.read(bArr, 0, 2048); read != -1; read = bufferedInputStream.read(bArr, 0, 2048)) {
                                    zipOutputStream2.write(bArr, 0, read);
                                }
                            }
                            zipOutputStream2.close();
                        } catch (Throwable th) {
                            th = th;
                            zipOutputStream = zipOutputStream2;
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                File file3 = this.f3212e;
                if (file3.exists()) {
                    file3.delete();
                }
                return Boolean.valueOf(file3.createNewFile());
        }
    }
}
