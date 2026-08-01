package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;

/* renamed from: class, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cclass extends IOException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Serializable f642e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f643e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cclass(FileNotFoundException fileNotFoundException) {
        super(fileNotFoundException);
        this.f643e = 1;
        this.f642e = "Encountered a [" + fileNotFoundException.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cclass(String str) {
        super(str);
        this.f643e = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cclass(String str, Exception exc, int i) {
        super(str);
        this.f643e = i;
        this.f642e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f643e) {
            case 0:
                return (RuntimeException) this.f642e;
            case 1:
            default:
                return super.getCause();
            case 2:
                return (GeneralSecurityException) this.f642e;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f643e) {
            case 1:
                return (String) this.f642e;
            default:
                return super.getMessage();
        }
    }
}
