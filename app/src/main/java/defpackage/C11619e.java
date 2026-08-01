package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11619e {
    public final long ad;

    public C11619e(long j) {
        this.ad = j;
    }

    public static C11619e ad(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C11619e(Long.parseLong(jsonReader.nextString())) : new C11619e(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C11619e) && this.ad == ((C11619e) obj).ad;
    }

    public final int hashCode() {
        long j = this.ad;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return AbstractC5087e.m1750native(this.ad, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
